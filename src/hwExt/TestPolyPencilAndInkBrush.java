package hwExt;

public class TestPolyPencilAndInkBrush {
	
	public static void main(String[] args) {
		
		SuperPen[] cc = new SuperPen[2];
		
		cc[0] = new Pencil("鉛筆", 15.0);
		cc[1] = new InkBrush("毛筆",20.0);
		
		
		for(int i = 0; i < cc.length; i++) {
			System.out.println(cc[i].getBrand());
			cc[i].write();
			System.out.println("價格 = " + cc[i].getPrice() + " 元 ");
		}	
		
	}

}
