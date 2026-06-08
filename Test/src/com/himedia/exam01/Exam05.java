package com.himedia.exam01;

import java.util.Scanner;

public class Exam05 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean flagExit = false;
		
		while(!flagExit) {
			System.out.println("0:프로그램종료");
			System.out.println("1:1번문제, 2:2번문제, 3:3번문제, 4:4번문제, 5:5번문제, 6:6번문제, 7:7번문제");
			System.out.print("번호입력 : ");
			int select1 = Integer.parseInt(scanner.nextLine());
			
			switch (select1) {
				case 1: practice01(); break;
				case 2: practice02(); break;
				case 3: practice03(); break;
				case 4: practice04(); break;
				case 5: practice05(); break;
				case 6: practice06(); break;
				case 7: practice07(); break;
				case 0: System.out.println("프로그램종료"); flagExit=true; break;
				default: System.out.println("잘못된 값 입력"); break;
			}
		}
		if (scanner != null) scanner.close();
	}

	private static void practice01() {
		System.out.println("===============1번 프로그램 시작=================");
		int intArray[] = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i+1;
		}
		
		for (int i : intArray) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n===============1번 프로그램 종료=================");		
	}
	
	private static void practice02() {
		System.out.println("===============2번 프로그램 시작=================");
		int intArray[] = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = intArray.length-i;
		}
		
		for (int i : intArray) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n===============2번 프로그램 종료=================");				
	}
	
	private static void practice03() {
		System.out.println("===============3번 프로그램 시작=================");
		
		int num1 = 0;
		boolean flagExit = false;
		
		while(!flagExit) {
			System.out.print("양의 정수 입력 : ");
			num1 = Integer.parseInt(scanner.nextLine());
			if (num1 > 0) {
				flagExit = true;
			} else {
				System.out.println("잘못된 수 입력됨");
			}
		}
		
		int intArray[] = new int[num1];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i+1;
		}
		
		for (int i : intArray) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n===============3번 프로그램 종료=================");			
	}
	
	private static void practice04() {
		System.out.println("===============4번 프로그램 시작=================");

		//“월” ~ “일” 까지 초기화된 문자열 배열을 만들고
		//0부터 6까지 숫자를 입력 받아, 입력한 숫자와 같은 인덱스에 있는 요일을 출력하세요.
		//단, 범위에 없는 숫자를 입력했을 경우 “잘못 입력하셨습니다＂를 출력하세요.
		int num1 = 0;
		boolean flagExit = false;
		while(!flagExit) {
			System.out.print("0 ~ 6 사이의 숫자 입력 : ");
			num1 = Integer.parseInt(scanner.nextLine());
			
			if (num1>=0 && num1<=6) flagExit = true;
			else System.out.println("잘못된 수 입력");
		}
		
		String arrDate[] = new String[] {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println(arrDate[num1]);

		System.out.println("\n===============4번 프로그램 종료=================");			
	}
	
	private static void practice05() {
		System.out.println("===============5번 프로그램 시작=================");
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1 ~ 10 사이의 랜덤 값을 배열에 초기화한 후 출력하세요.

		int intArray[] = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*10)+1;
		}
		
		for (int i : intArray) {
			System.out.printf("%3d", i);
		}
		
		System.out.println("\n===============5번 프로그램 종료=================");			
	}
	
	private static void practice06() {
		System.out.println("===============6번 프로그램 시작=================");
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1 ~ 10 사이의 랜덤 값을 배열에 초기화한 후 출력하세요.

		int intArray[] = new int[10];
		
		//랜덤 초기화
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*100)+1;
		}
		
		// 출력
		for (int i : intArray) {
			System.out.printf("%3d", i);
		}
		
		System.out.println();
		
		int max1 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		//최대값 최소값 출력

		for (int j = 0; j < intArray.length; j++) {
			if (max1 < intArray[j]) max1 = intArray[j];
		}
		
		System.out.printf("최대값 : %d\n", max1);
		
		for (int k = 0; k < intArray.length; k++) {
			if (min1 > intArray[k]) min1 = intArray[k];
		}

		System.out.printf("최소값 : %d\n", min1);
		
		System.out.println("\n===============6번 프로그램 종료=================");			
	}

	private static void practice07() {
		System.out.println("===============7번 프로그램 시작=================");
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1 ~ 10 사이의 랜덤 값을 배열에 초기화한 후 출력하세요.

		int intArrayLotto[] = new int[7];

		for (int i = 0; i < intArrayLotto.length; i++) {
			int temp1 = (int)(Math.random()*45)+1;
			
			boolean dupliCheck = false;
			
			for (int j = 0; j < intArrayLotto.length; j++) {
				if (intArrayLotto[j] == temp1) {dupliCheck = true; break;}
			}
			
			if (dupliCheck == true) {i--; continue;}
			
			intArrayLotto[i] = temp1;
		}
		// 출력
		for (int i : intArrayLotto) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();		
		System.out.println("\n===============7번 프로그램 종료=================");			
	}
	
}