package chapter07.month;

import java.util.Arrays;

public class ATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		a.print();
		
		int num = a.data();
		System.out.printf("num = %d\n", num);
		
		double value = a.sum(10, 20.45);
		System.out.printf("value = %.2f\n", value);

		a.printMonth(20);
		a.printMonth(11);
		
		//a.staticPrint();
		A.staticPrint();
		
		double value2 = A.staticSum(20, 20.45);
		System.out.printf("value2 = %-10.2f\n", value2);
		
		//==============================================
		
		int[] array1;
		array1 = new int[3];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		System.out.printf("%s\n", Arrays.toString(array1));
		A.intArrayPrint(array1);
//		A.intArrayPrint(new int[3]); // 0출력

		int[] array2;
		array2 = new int[] {11, 21, 31};
		System.out.printf("%s\n", Arrays.toString(array2));
		A.intArrayPrint(new int[] {11, 21, 31});

		int[] array3 = {12, 22, 32};
//		int[] array3;
//		array3 = {12, 22, 32}; 에러
		System.out.printf("%s\n", Arrays.toString(array3));
		A.intArrayPrint(array3);
//		a.intArrayPrint({12, 22, 32}); 에러
		
	}
}
