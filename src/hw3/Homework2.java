package hw3;

import java.util.Scanner;

public class Homework2 {
//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
//
//	(提示:Scanner,亂數方法,無窮迴圈)
//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" 開始猜數字吧! ");
//		
//		int j;
//		j = (int)(Math.random() * 10);
//		
//		while(true) {
//			int i = sc.nextInt();
//			if(i == j) {
//				break;
//			}else {
//				System.out.println(" 猜錯囉! ");
//				
//			}
//			
//		}
//		System.out.println(" 猜對了! 答案就是" + j);
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 開始猜數字吧! ");
		
		int j;
		j = (int)(Math.random() * 101);
		
		while(true) {
			int i = sc.nextInt();
			if(i == j) {
				break;
			}else if(i < j) {
				System.out.println(" 小於正確答案! ");
			}else if (i > j) {
				System.out.println(" 大於正確答案! ");
			}
			
		}
		System.out.println(" 猜對了! 答案就是" + j);
		sc.close();
	}
	
}
