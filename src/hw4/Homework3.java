package hw4;

import java.util.Scanner;

public class Homework3 {
//	• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try { 
			System.out.println("請輸入年份");
			int year = sc.nextInt();
			if(year < 1) {
				throw new DateException("請輸入正確年份");
			}
			int[] c = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				c[2] = 29;
			}
			System.out.println("請輸入月份");
			int month = sc.nextInt();
			if(month < 1 || month > 12) {
				throw new DateException("請輸入1-12月份");
			}
			System.out.println("請輸入日期");
			int day = sc.nextInt();
			if(day < 1 || day > c[month]) {
				throw new DateException("日期輸入錯誤");
			}
			int sum = 0;
			for(int i = 1; i < month; i++) {
				sum += c[i];
			}
			sum = sum + day;
			System.out.println("輸入的日期為該年第 " + sum + " 天");
			
		} catch (DateException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
			
	}
}
