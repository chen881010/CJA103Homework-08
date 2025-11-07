package hwExt;

public class Pencil extends SuperPen{
	
	public Pencil(String brand, double price) {
		super(brand, price);
	}

	public void write() {
		System.out.println("削過後再寫");
	}
	
	public double getPrice() {
		return super.getPrice() * 0.8;
	}
	
	
}
