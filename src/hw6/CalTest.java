package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("請輸入x的值");
			String xi = sc.next();
			if(!xi.matches("-?[0-9]+")){
				throw new CalException("輸入格式不正確");
			}
			System.out.println("請輸入y的值");
			String yi = sc.next();	
			if(!yi.matches("-?[0-9]+")) {
				throw new CalException("輸入格式不正確");
			}
			
			int x = Integer.parseInt(xi);
	        int y = Integer.parseInt(yi);
			
			Calculator c1 = new Calculator(x, y);
			c1.powerXY();
			
		} catch (CalException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	}
}
