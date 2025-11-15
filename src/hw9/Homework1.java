package hw9;

public class Homework1 implements Runnable{
	int cc = 1;
	String name;
	
	public Homework1(String name) {
		this.name = name;
	}
	
	public void run() {
		while(cc <= 10) {
			int eattime =(int)(Math.random() * 2501) + 500;
			synchronized(System.out) {
				System.out.println(name + "吃第" + cc + "碗飯");
				if(cc == 10) {
				System.out.println(name + "吃完了!");
				}
			}
			cc++;
			try {
				Thread.sleep(eattime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
//		• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//		競賽過程。
//		• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//		Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//		• 參考範例:CounterRunnable.java
//		• 需留意主執行緒執行順序
		System.out.println("----------大胃王快食比賽開始!----------");
		Homework1 h1 = new Homework1("詹姆士");
		Homework1 h2 = new Homework1("饅頭人");
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------大胃王快食比賽結束!----------");
	}

}
