package hw9;

class Account {
	
	int balance = 0;
	boolean remitFinished = false;
	boolean withdrawFinished = false;

	synchronized public void remit(int money) {
		if(withdrawFinished) {
			return;
		}
		while(balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			System.out.println("熊大被老媽告知帳戶已經有錢");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.println("媽媽存了2000，" + "帳戶共有 : " + balance);
		notifyAll();
	}
	
	synchronized public void withdraw(int money) {
		if(remitFinished) {
			return;
		}
		while(balance < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println("熊大領了1000，帳戶共有 : " + balance);
		if(balance <= 2000) {
			System.out.println("熊大看到餘額在2000元以下，要求匯款");
		}
		notifyAll();
	}
}

class Remiter extends Thread {
	Account account;
	
	public Remiter(Account account) {
		this.account = account;
	}
	
	public void run() {
		int count = 1;
		while(count <= 10) {
			account.remit(2000);
			count++;
		}	
		synchronized(account) {
	        account.remitFinished = true;
	        account.notifyAll();
	    }	
	}
}

class Withdrawer extends Thread {
	Account account;
	
	public Withdrawer(Account account) {
		this.account = account;
	}
	
	public void run() {
		int count = 1;
		while(count <= 10) {
			account.withdraw(1000);
			count++;
		}
		synchronized(account) {
	        account.withdrawFinished = true;
	        account.notifyAll();
	    }
	}
}

public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account();
		Remiter remiter = new Remiter(account);
		Withdrawer withdrawer = new Withdrawer(account);
		
		remiter.start();
		withdrawer.start();
	}
}
