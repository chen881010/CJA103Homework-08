package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework3 {
	public static void main(String[] args) throws IOException {
//		請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案
		File inputFile = new File("C:\\作業用\\Sample.txt");
		File outputFile = new File("C:\\作業用\\CopySample.txt");
		copyFile(inputFile, outputFile);
	}	
	public static void copyFile(File realFile, File copyFile) throws IOException {
		FileReader in = new FileReader(realFile);
		BufferedReader br = new BufferedReader(in) ;
		
		FileWriter out = new FileWriter(copyFile);
		BufferedWriter bw = new BufferedWriter(out);
		
		int i;
		while((i = br.read()) != -1) {
			bw.write((char)i);
		}	
		
		br.close();
		in.close();
		bw.close();
		out.close();
	
	}
}
