package hw10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
//		• 請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成(1)
//		年/月/日(2)月/日/年(3)日/月/年三選一,而輸入非指定日期數字格式會顯示出提示訊息如圖
//		(提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期(年月日，例如19991010)");
		
		String cc = sc.nextLine().trim();
		
		LocalDate date;
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuuMMdd").withResolverStyle(ResolverStyle.STRICT);
		        
		try {
		    date = LocalDate.parse(cc, dtf);  // 這裡會自動檢查合法日期
	    } catch (DateTimeParseException e) {
	        System.out.println("日期格式不正確，請再輸入一次");
	        sc.close();
	        return;
	    }
		
//		if (!cc.matches("\\d{8}")) {
//		    System.out.println("日期格式不正確，請再輸入一次");
//		    sc.close();
//		    return;
//		}   
		
		System.out.println("欲格式化成 (1) 年/月/日 (2) 日/月/年 (3) 月/日/年");
		int x = sc.nextInt();
	    if(!(x == 1 || x == 2 || x == 3)) {
        	System.out.println("請輸入方法 1 ~ 3 ");
        	sc.close();
        	return;
	    }
	    
	    if(x == 1) {
	    	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("uuuu/MM/dd");
	    	System.out.println("年/月/日 " + date.format(dtf1));
	    }else if(x == 2) {
	    	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/uuuu");
	    	System.out.println("月/日/年 " + date.format(dtf2));
	    }else {
	    	DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	    	System.out.println("日/月/年 " + date.format(dtf3));
	    }
	    sc.close();
	}
}	
	

