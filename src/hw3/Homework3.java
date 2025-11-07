package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
//	• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in); 
//		System.out.println(" 阿文...請輸入你討厭哪個數字? ");
//		int x = sc.nextInt();
//		
//		
//		int i, count = 0;
//		for(i = 1; i <= 49; i++) {
//			int ix = i / 10;
//			int xi = i % 10;
//			if(xi != x && ix != x) {
//				count++;
//				System.out.print(i + "\t");
//				if(count % 6 == 0) {
//					System.out.println();
//				}
//				
//			}
//			
//		}
//		System.out.println("總共有" + count + "個數字可以選");
//		sc.close(); 
		
		
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 阿文...請輸入你討厭哪個數字? ");
		int x = sc.nextInt();
		
		int[] cc = new int[49];
		int count = 0;
		
		for(int i = 1; i <= 49; i++) {
			int ix = i / 10;
			int xi = i % 10;
			if(xi != x && ix != x) {
				cc[count] = i;
				count++;
			}
			
		}
		
		for (int i = count - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));
            int temp = cc[i];
            cc[i] = cc[j];
            cc[j] = temp;
        }
		
		int[] result = Arrays.copyOf(cc, 6);
		Arrays.sort(result);
		
		System.out.println("  阿文的號碼是： "); 
		for (int i = 0; i < 6; i++) {
		    System.out.print(result[i] + " ");
		}
		sc.close();
	}
	
}
	
