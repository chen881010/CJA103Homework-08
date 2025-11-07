package hw4;

public class Homework4 {
	public static void main(String[] args) {
//		• 班上有8位同學,他們進行了6次考試結果如下:
//
//			請算出每位同學考最高分的次數
//			(提示:二維陣列)
		int[][] cc = {
				{0, 1, 2, 3, 4, 5, 6, 7, 8},
				{1, 10, 35, 40, 100, 90, 85, 75, 70},
				{2, 37, 75, 77, 89, 64, 75, 70, 95},
				{3, 100, 70, 79, 90, 75, 70, 79, 90},
				{4, 77, 95, 70, 89, 60, 75, 85, 89},
				{5, 98, 70, 89, 90, 75, 90, 89, 90},
				{6, 90, 80, 100, 75, 50, 20, 99, 75},
		};		
		int[] studentCount = new int[9];
		
		for(int i = 1; i < cc.length; i++) {
			int maxStudent = -1;
			int maxGrade = -1;
			for(int j = 1; j < cc[i].length; j++) {
				int student = cc[0][j];
				int test = cc[i][0];	
				int grade = cc[i][j];
				
				if(grade > maxGrade) {
					maxGrade = grade;
					maxStudent = student;
				}
			}
			studentCount[maxStudent]++;
		}
		for(int i = 1; i < studentCount.length; i++) {
			System.out.println("學生 " + i + " 得過最高分 " + studentCount[i] + " 次");
		}
	}
}
