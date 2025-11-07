package hw1;

public class Homework5 {
	public static void main(String[] args) {
		double x = 1500000;
		int i;
		for(i = 1; i <= 10; i++) {
//			FV=PV(1+i)n
			x = (int)x * (1 + 0.02);
				
		}
		
		System.out.println(x);		
	}

}
