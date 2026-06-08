package chapter05;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[] {10, 20, 30};
		int[] a2 = a1;
		
		a2[0] = 60;
		a2[1] = 70;
		a2[2] = 80;
		
		//배열 주소를 반납해버린다
		String str1A1 = a1.toString();
		System.out.printf("str1A1 = %s\n", str1A1);
		
		String str2A1 = Arrays.toString(a1);
		System.out.printf("str2A1 = %s\n", str2A1);
		
		String str2A2 = Arrays.toString(a2);
		System.out.printf("str2A2 = %s\n", str2A2);

	}

}
