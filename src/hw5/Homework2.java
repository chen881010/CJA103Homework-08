package hw5;

public class Homework2 {
	public static void main(String[] args) {
//		利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//		可以找出二維陣列的最大值並回傳
		int[][] imax = new int[][] {
							{1, 2, 3},
							{4, 5},
							{10, 7, 8, 9}
						};
		double[][] dmax = new double[][] {
							{1.2, 2.3, 3.4},
							{4.5, 5.6},
							{9.7, 7.8, 8.9, 9.0}
						};
		maxElement(imax);
		maxElement(dmax);
		
	}
	
	public static int maxElement(int[][] arr1) {
		int max = arr1[0][0];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j] > max) {
					max = arr1[i][j];
				}
			}
		}
		System.out.println(max);
		return max;
	}
	
	public static double maxElement(double[][] arr2) {
		double max = arr2[0][0];
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				if(arr2[i][j] > max) {
					max = arr2[i][j];
				}
			}
		}
		System.out.println(max);
		return max;
	}
	
	
}
