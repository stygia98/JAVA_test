package com.himedia.exam01;

import java.util.Scanner;

public class ExamSample0 {
	static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		
		boolean exitFlag = false;
		
		while (!exitFlag) {
			System.out.println("0:프로그램종료");
			System.out.println("1:1번문제, 2:2번문제, 3:3번문제, 4:4번문제, 5:5번문제");
			System.out.print("번호입력 : ");
			int select1 = Integer.parseInt(scanner.nextLine());
			
			switch (select1) {
				case 1: practice01(); break;
				case 2: practice02(); break;
				case 3: practice03(); break;
				case 4: practice04(); break;
				case 5: practice05(); break;
				case 0: System.out.println("프로그램 종료"); exitFlag = true; break;
				default: System.out.println("잘못된 값 입력"); break;
			}
		}
		if(scanner!=null) scanner.close();

	}

	private static void practice01() {
		// TODO Auto-generated method stub
		System.out.println("===============1번 프로그램 시작=================");
		
		
		
		System.out.println("\n===============1번 프로그램 종료=================");
	}	
	
	private static void practice02() {
		// TODO Auto-generated method stub
		System.out.println("===============2번 프로그램 시작=================");

		
		
		System.out.println("\n===============2번 프로그램 종료=================");
	}
	
	private static void practice03() {
		// TODO Auto-generated method stub
		System.out.println("===============3번 프로그램 시작=================");

		
		
		System.out.println("\n===============3번 프로그램 종료=================");
	}
	
	private static void practice04() {
		// TODO Auto-generated method stub
		System.out.println("===============4번 프로그램 시작=================");

		
		
		System.out.println("\n===============4번 프로그램 종료=================");		
	}

	private static void practice05() {
		// TODO Auto-generated method stub
		System.out.println("===============5번 프로그램 시작=================");

		
		
		System.out.println("\n===============5번 프로그램 종료=================");		

	}
	
}


