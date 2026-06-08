package chapter05;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] a = new int[2][3];
//		int[] a = new int[2];
//		a[0] = new int[3];
//		a[1] = new int[3];
		
		int[][]a = new int[2][3];
		
		System.out.printf("a.length = %d\n", a.length);
		System.out.printf("a[0].length = %d\n", a[0].length);
		System.out.printf("a[1].length = %d\n", a[1].length);
		System.out.printf("a[0][0] = %d\n", a[0][0]);
		System.out.println();
		
//		int[][]b = new int[2][];
//		b[0] = new int[] {1, 2, 3};
//		b[1] = new int[] {1, 2, 3, 4};

//		int[][]b = new int[][] {{1, 2, 3}, {1, 2, 3, 4, 5}};
		
		int[][]b = {{1, 2, 3}, {1, 2, 3, 4, 5}};
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("b[%d][%d] = %d \n",i ,j, b[i][j]);
			}
			System.out.println("=========================");
		}
		
		for (int j = 0; j < b[0].length; j++) {
			System.out.printf("b[%d][%d] = %d \n",0 ,j, b[0][j]);
		}
		System.out.println("=========================");
		
		for (int k = 0; k < b[1].length; k++) {
			System.out.printf("b[%d][%d] = %d \n",1 ,k, b[1][k]);
		}

	}

}
