package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Homework5 {
//	承上題,請寫一個程式,能讀取Object.ser這兩個物件,並執行speak()方法觀察結果如何 (請利用多
//			型簡化本題的程式設計)
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				Animal animal = (Animal) ois.readObject();
				animal.speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();	
	}

}
