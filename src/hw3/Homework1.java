package hw3;

import java.util.Scanner;

public class Homework1 {
//	• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
//
//	(提示:Scanner,三角形成立條件,判斷式if else)
//	(進階功能:加入直角三角形的判斷)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 請輸入三個數字(數字中間用空白隔開): ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x <= 0 || y <= 0 || z <= 0 || (x + y <= z) || (y + z <= x) || (x + z <= y)) {
			System.out.println("不是三角形");
		}else if (x == y && y == z && y != 0) {
			System.out.println("正三角形");
		}else if (x == y || y == z || x == z) {
			System.out.println("等腰三角形");
		}else if ((x * x + y * y == z * z) || (y * y + z * z == x * x) || (x * x + z * z == y * y)) {
			System.out.println("直角三角形");
		}else {
			System.out.println("其他三角形");
		}
		sc.close();
		
	}

}
