package hw10;


public class Homework1 {
	
	public static void main(String[] args) {
		int j;
		
		for(int i = 0; i < 5; i++) {
			j = (int)(Math.random() * 100) + 1;
			
			if(isPrime(j)) {
				System.out.println(j + "是質數");
			}else{
				System.out.println(j + "不是質數");
			}
		}	
	}

	public static boolean isPrime(int j) {
		if (j <= 1) {
			return false; 
		}
		for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
            	return false;
            }
		}
		return true;
	}
}	
