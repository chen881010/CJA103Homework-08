package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Homework4{

	public static void main(String[] args) throws IOException {
//		請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//		意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
		File file = new File("C:\\data");
		
		if(!file.exists()) {
			file.mkdir();
		}
		
		Dog tim = new Dog("tim");
		Cat tom = new Cat("tom");
		
		FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(tim);
		oos.writeObject(tom);
			
		oos.close();
		fos.close();
		
	}

}
