package chapter05;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		System.out.println(a);
		
		int[] ia = null;
		System.out.println(ia);
		
		int[] aArray = {3, 4, 5};
		int[] bArray = aArray;
		bArray[0] = 10;
		
		System.out.printf("aArray[0] = %d\n", aArray[0]);
		System.out.printf("bArray[0] = %d\n", bArray[0]);
		System.out.println("aArray 배열길이 : " + aArray.length);
		System.out.println();
		
		//배열출력-반복문
		//for / 향상for
		String[] cArray = {"3", "4", "5"};
		for (int i = 0; i < cArray.length; i++) {
			System.out.printf("cArray[%d] = %s\n",i ,cArray[i]);
		}
		System.out.println();

		int count = 0;
		for (String i : cArray) {
			System.out.printf("cArray[%d] = %s\n",count++, i);
		}
		System.out.println();

		int[] dArray = {3, 4, 5};
		String strArray = Arrays.toString(dArray) + "문자열";
			System.out.println(strArray);

	}

}
