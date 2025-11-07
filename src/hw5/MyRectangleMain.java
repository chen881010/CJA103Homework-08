package hw5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		
		MyRectangle zz = new MyRectangle();
		zz.setWidth(10);
		zz.setDepth(20);
		
		MyRectangle xx = new MyRectangle(10,20);
		
		System.out.println(xx.getArea());
		System.out.println(zz.getArea());
		
	}
	
}


