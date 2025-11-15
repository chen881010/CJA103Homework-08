package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Homework1 {
	public static void main(String[] args) {
//		• 請建立一個Collection物件並將以下資料加入:
//			Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//			Object物件、“Snoopy”、BigInteger(“1000”)
//
//			• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//			• 移除不是java.lang.Number相關的物件
//			• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功

		    	Collection<Object> data = new ArrayList<>();
		        
		        data.add(Integer.valueOf(100));
		        data.add(Double.valueOf(3.14));
		        data.add(Long.valueOf(21L));
		        data.add(Short.valueOf("100"));
		        data.add(Double.valueOf(5.1));
		        data.add("Kitty");
		        data.add(Integer.valueOf(100));     
		        data.add(new Object());             
		        data.add("Snoopy");
		        data.add(new BigInteger("1000"));
		        
		        System.out.println("傳統的for迴圈");
				for (int i = 0; i < data.size(); i++)
					System.out.println(((ArrayList<Object>) data).get(i));
				System.out.println();
				
				System.out.println("使用iterator迴圈");
				Iterator<Object> it = data.iterator(); 
				while(it.hasNext())
					System.out.println(it.next());
				System.out.println();
		        
				System.out.println("增強功能的 for 迴圈(Using Enhanced foreach)");
				for (Object objs : data)
					System.out.println(objs);
				System.out.println();
		       
		        Iterator<Object> itr = data.iterator();
		        while(itr.hasNext()) {
		        	Object objs = itr.next();
		        	if(!(objs instanceof Number)) {
		        		itr.remove();
		        	}
		        }
		        
		        for(Object objs : data)
		        	System.out.println(objs);
		     
	}
}
