package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TrainSet {
	public static void main(String[] args) {
//		• 請寫一隻程式,能印出不重複的Train物件
		Set<Train> set = new HashSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		System.out.println("增強功能的 for 迴圈(Using Enhanced foreach)");
		for(Train t : set) {
			System.out.println("Train = " + t.getNumber() + "-" + t.getType() + "-" + t.getStart() + "-" + t.getDest() + "-" + t.getPrice());
		}
		
		System.out.println();
		
		System.out.println("使用iterator迴圈");
		Iterator<Train> it = set.iterator();
		while(it.hasNext()) {
			Train t = it.next();
			System.out.println("Train = " + t.getNumber() + "-" + t.getType() + "-" + t.getStart() + "-" + t.getDest() + "-" + t.getPrice());
		}
	}
}
