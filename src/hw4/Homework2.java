package hw4;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//
//		(提示:Scanner,二維陣列)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入欲借金額: ");
        int x = sc.nextInt();
		
		int[][] cc = new int[][] {
						  {25, 2500},
						  {32, 800},
						  {8, 500},
						  {19, 1000},
						  {27, 1200}
					  };
					  
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < cc.length; i++) {
			int empno = cc[i][0];
			int money = cc[i][1];
			if(x <= money) {
				sb.append(empno).append(" ");
				count++;
			}
		}
		System.out.println("「有錢可借的員工編號」:" + sb.toString() + "共 " + count + " 人");
		sc.close();
	}
}
