package hw4;

import java.util.Arrays;

public class Homework1 {
//	• 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
	
	public static void main(String[] args) {
		
		String[] planet = new String[]{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int aeioucount = 0;
		for(int i = 0; i < planet.length; i++) {
			aeioucount += aeiou(planet[i]);
		}
		System.out.println(aeioucount);
	}
	
	public static int aeiou(String planet) {
		int count = 0;
		for(int i = 0; i < planet.length(); i++) {
			char aeiou = planet.charAt(i);
			switch(aeiou) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		return count++;
	}
}
//		int[] cc = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//		int sum = 0;
//		for(int i = 0; i < cc.length; i++) {
//			sum += cc[i];
//		}
//		int avg = sum / cc.length;
//		System.out.println("平均值 = " + avg);
//		
//		Arrays.sort(cc);
//		
//		System.out.print("大於平均值 = ");
//		for(int i = 0; i < cc.length; i++) {
//			if(cc[i] > avg) {
//				System.out.print(cc[i] + " ");
//			}
//		}
//		System.out.println();
//		
//		String s ="Hello World";
//		char[] c = s.toCharArray();
//		for(int i = c.length - 1; i >= 0; i--) {
//			System.out.print(c[i]);
//		}
//		
//		System.out.println();
//		
//	}
	
