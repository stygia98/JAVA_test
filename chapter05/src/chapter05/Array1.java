package chapter05;

import java.util.Scanner;

public class Array1 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		while(true) {
			System.out.println("0:프로그램종료");
			System.out.println("1:5페이지, 2:10페이지, 3:11페이지, 4:4번문제, 5:5번문제");
			System.out.print("번호입력 : ");
			int select1 = Integer.parseInt(scanner.nextLine());
		
			switch (select1) {
				case 0: System.out.println("프로그램 종료"); break;
				case 1: practice01(); break;
				case 2: practice02(); break;
				case 3: practice03(); break;
				case 4: practice04(); break;
//				case 5: practice05(); break;
				default: System.out.println("잘못된 값 입력"); break;
			} //switch end
		
			if(select1==0) break;
		}//while end
		
		if(scanner != null) scanner.close();
	}//main end
	
	private static void practice01() {
		System.out.println("===============1번 프로그램 시작=================");
		//배열 - 정수 실수 문자 부울 문자배열
		
		//자바스크립트
		//let a = [10, 23.4, "abcd", false];
		//let a = new Array(4);
		//let a = new Array(10, 23.4, "abcd", false);
		
		//자바
		int[] intArray1 = new int[4];
		intArray1[0] = 10;
		intArray1[1] = 20;
		intArray1[2] = 30;
		intArray1[3] = 40;
		int[] intArray2 = new int[] {10, 20, 30, 40};

		System.out.printf("%3d \t", intArray2[0]);
		System.out.printf("%3d \t", intArray2[1]);
		System.out.printf("%3d \t", intArray2[2]);
		System.out.printf("%3d \t", intArray2[3]);
		System.out.println();

		for (int i = 0; i < intArray2.length; i++) {
			System.out.printf("%3d \t", intArray2[i]);
		}
		System.out.println("\n===============1번 프로그램 종료=================");
	}
	
	private static void practice02() {
	System.out.println("===============2번 프로그램 시작=================");

		//배열 선언 방식1
		int[] intArray = new int[4];
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;

		arrayPrint(intArray);
		
		System.out.println();
		//배열 선언 방식2
		int[] intArray2 = new int[] {11, 22, 33, 44};
		
		arrayPrint(intArray2);
		
	System.out.println("\n===============2번 프로그램 종료=================");
	}

	public static void arrayPrint(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%-5d", array[i]);
		}
		return;
	}
	
	private static void practice03() {
		System.out.println("===============3번 프로그램 시작=================");
		
		int[] ia = new int[3];
		ia[0] =10;
		ia[1] =20;
		ia[2] =30;
//		ia[3] =40;
		
		//int[] ia2 = new int[] {10, 20, 30};
		//int[] ia22 = null;
		//ia22 = new int[] {10, 20, 30};
		
		//int[] ia3 = {10, 20, 30};
		//int[] ia4 = null;
//		ia4 = {10, 20, 30};		
		
		System.out.println("\n===============3번 프로그램 종료=================");
	}

	private static void practice04() {
		System.out.println("===============4번 프로그램 시작=================");


		
		
		System.out.println("\n===============4번 프로그램 종료=================");
	}
	
	
}
