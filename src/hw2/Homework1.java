package hw2;

public class Homework1 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		System.out.println("• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)");
		
		int i, j;
		int sum = 0;
		int x = 0;
		for(i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
			
		}
		System.out.println(sum);
		System.out.println("• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)");
		
		j = 1;
		for(i = 1; i <= 10; i++) {
			j *= i;
		}
		System.out.println(j);
		System.out.println("• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)");
		
		while(i <= 10) {
			j *= i;
			j++;
		}
			
		System.out.println(j);	
		System.out.println("• 請設計一隻Java程式,輸出結果為以下:\r\n" + "1 4 9 16 25 36 49 64 81 100");
		
		for(i = 1; i <= 19; i++) {
			if(i % 2 != 0) {
				x += i;
				System.out.print(x + " ");
			}
			
		}
		
	}

}
