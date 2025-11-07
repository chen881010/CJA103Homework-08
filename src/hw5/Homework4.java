package hw5;

public class Homework4 {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合
	public static void main(String[] args) {
		System.out.println(genAuthCode());
	}
	
	public static String genAuthCode() {
		int length = 8;
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < length; i++) {
			int type = (int)(Math.random() * 3);
			char cc;
			if(type == 0) {
				cc = (char)((int)(Math.random() * 26) + 'A');
			}else if(type == 1){
				cc = (char)((int)(Math.random() * 26) + 'a');
			}else {
				cc = (char)((int)(Math.random() * 10) + '0');
			}
			result.append(cc);
		}
		return result.toString();
	}
}
