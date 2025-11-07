package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework1 {
	public static void main(String[] args) throws IOException {
//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//		Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
		
		File myFile = new File("C:\\作業用\\Sample.txt");
		long bytes = myFile.length();
		
		FileReader fr = new FileReader(myFile);
		int c;
		int chars = 0;
        while((c = fr.read()) != -1) {
        	chars++;
        }
        fr.close();
        
        int lines = 0;
        FileReader fr1 = new FileReader(myFile);
        BufferedReader br = new BufferedReader(fr1) ;
        String s;
        while((s = br.readLine()) != null) {
        	lines++;
        }
        br.close();   
        fr.close();
		
		System.out.println("Sample.txt檔案共有 " + bytes + " 個位元組, " + chars + " 個字元, " + lines + " 列資料");
	}

}
