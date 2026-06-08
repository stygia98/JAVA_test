package com.himedia.class8;

import java.util.Scanner;

public class ByteValue {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final double PI = 3.141592;
		// byte -128 ~ 127
//		byte byteValue = -128; // (byte)(byteValue -1)
//		byte a = -1;
		byte byteValue = 127; // (byte)(byteValue +1)
		
		
		System.out.printf("byteValue = %d", (byte)(byteValue +1) );
		
//		System.out.print("문자열입력 : ");
//		String name = scanner.nextLine();
//
//		System.out.printf("당신이 입력한 문자열 : %s\n", name);
//
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println(name.charAt(i));
//		}
//		
//		System.out.println();
//		
//		//정수 값 2진수 8진수 16진수 출력
//		System.out.print("정수값 입력 : ");
//		int num = Integer.parseInt(scanner.nextLine());
//		
//		System.out.printf("십진법 : %d\n", num);
//		System.out.printf("팔진법 : %o\n", num);
//		System.out.printf("십육진법 : %x\n", num);
//		System.out.printf("이진법 : %s\n", Integer.toBinaryString(num));

		
		
		scanner.close();
	}

}
