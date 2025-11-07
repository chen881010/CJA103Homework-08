package hw5;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" 請輸入寬高(數字中間用空白隔開): ");
//		int width = sc.nextInt();
//		int height = sc.nextInt();
//		
//		starSqare(width, height);
//		sc.close();
//		
//	}
//	
//	public static void starSqare(int width, int height) {
//		for(int i = 0; i < height; i++) {
//			for(int j = 0; j < width; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
		
		int[] cc = new int[10];
		int sum = 0;
		for(int i = 0; i < cc.length; i++) {
			cc[i] = (int)(Math.random() * 101);
			System.out.print(cc[i] + " ");
			sum += cc[i];
		}
		System.out.println();
		randAvg(sum);
	}
		
	public static double randAvg(int number) {
		double avg = number / 10.0;
		System.out.println(avg);
		return avg;
	}
	
	
}
