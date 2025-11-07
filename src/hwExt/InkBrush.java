package hwExt;

public class InkBrush extends SuperPen{
	
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("沾墨汁後再寫");
	}
	
	public double getPrice() {
		return super.getPrice() * 0.9;
	}
	
	
}
