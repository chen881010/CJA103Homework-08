package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class Homework2 {
	public static void main(String[] args) throws IOException {
		
//		請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//				append功能讓每次執行結果都能被保存起來)
		List list = new ArrayList();
		
		while(list.size() != 10) {
			int cc = (int)(Math.random() * 1001);
			list.add(cc);
		}
		
		FileOutputStream fos = new FileOutputStream("c:\\作業用\\Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);

		ps.println(list);
		
		ps.close();
		bos.close();
		fos.close();
		
		
	}

}
