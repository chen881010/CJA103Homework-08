package hw1;

public class Homework3 {
//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main(String[] args) {
		int xSecond = 256559;
		int daySecond= 24 * 60 * 60;
		int hourSecond = 60 * 60;
		int minuteSecond = 60;
		
		int day = xSecond / daySecond;
		int xday = xSecond % daySecond;
		
		int hour = xday / hourSecond;
		int xhour = xday % hourSecond;
		
		int minute = xhour / minuteSecond;
		int second = xhour % minuteSecond;
		
		System.out.println(day + "天" + hour +"小時" + minute + "分" + second + "秒");
		
	}
}
