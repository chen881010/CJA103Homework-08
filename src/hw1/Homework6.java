package hw1;

public class Homework6 {
	public static void main(String[] args) {
		
		System.out.println(5 + 5);
//		單純計算5+5=10 數學計算
		System.out.println(5 + '5');
//		'5'單引號 → char 型態
//		在 Java 中，char 是用 整數（Unicode/ASCII 編碼） 來表示的
//		'5' 的 ASCII 編碼是 53
//		所以等於5+53=58
		System.out.println(5 + "5");
//		""雙引號 = String 字串 把5跟"5"這個字串合在一起
	}

}
