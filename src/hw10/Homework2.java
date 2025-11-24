package hw10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
//		• 請設計一隻程式,讓使用者可以輸入一個任意數後,可以選擇要以下列何種表示方法顯示(1)千分位
//		(2)百分比(3)科學記號,而輸入非任意數會顯示提示訊息如圖 (提示: TestFormatter.java, Java API
//		文件, 判斷數字可用正規表示法)
//		• 補充 (依此類推):
//		輸入12345,千分位為12,345,輸入123,千分位為123
//		輸入0.75,百分比為75%,輸入1,結果為100%
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		
		String cc = sc.nextLine();
		
		if(!cc.matches("-?\\d+(\\.\\d+)?")) {
			System.out.println("數字格式不正確，請再輸入一次");
			sc.close();
			return;
		}

		double input = Double.parseDouble(cc);
		
        System.out.println("欲格式化成 (1) 千分位 (2) 百分比 (3) 科學記號 : ");
        
        int x = sc.nextInt();
        if(!(x == 1 || x == 2 || x == 3)) {
        	System.out.println("請輸入方法 1 ~ 3 ");
        	sc.close();
        	return;
        }
        
		if(x == 1) {
			System.out.println(formatThousand(input));
		}else if(x == 2) {
			System.out.println(formatPercent(input));
		}else {
			System.out.println(formatScientific(input));
		}
		sc.close();
	}
	public static String formatThousand(double input) {
		DecimalFormat ft = new DecimalFormat("#,###");
		return ft.format(input);
	   
	}

	public static String formatPercent(double input) {
		DecimalFormat fp = new DecimalFormat("#%");
		return fp.format(input);
	}

	public static String formatScientific(double input) {
		DecimalFormat fs = new DecimalFormat("0.00E0");
	    return fs.format(input);
	}
}
