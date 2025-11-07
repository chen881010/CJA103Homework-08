package hw2;

public class Homework3 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		for(char i = 'A'; i <= 'F'; i++) {
			for(char j = 'A'; j <= i; j++) {				
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("==============練習==============");
		
		for(char i = 'F'; i >= 'A'; i--) {
			for(char j = 'A'; j <= i; j++) {				
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
