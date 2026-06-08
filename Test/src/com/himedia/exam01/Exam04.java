package com.himedia.exam01;

import java.util.Scanner;

public class Exam04 {
	static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("0:프로그램종료");
			System.out.println("1:1번문제, 2:2번문제, 3:3번문제, 4:4번문제, 5:5번문제");
			System.out.print("번호입력 : ");
			int select1 = Integer.parseInt(scanner.nextLine());
			
			switch (select1) {
				case 0: System.out.println("프로그램 종료"); break;
				case 1: practice01(); break;
				case 2: practice02(); break;
				case 3: practice03(); break;
				case 4: practice04(); break;
				case 5: practice05(); break;
				default: System.out.println("잘못된 값 입력"); break;
			}

			if(select1 == 0) break;
		}
		scanner.close();

	}

	private static void practice01() {
		System.out.println("===============1번 프로그램 시작=================");
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
	
			if (num1 <= 0) {System.out.println("1 이상의 숫자를 입력해주세요");}
			else {
				for (int i = num1; i > 0; i--) {
					System.out.printf("%d ", i);
				}
				break;
			}
		}
		System.out.println("\n===============1번 프로그램 종료=================");
	}	
	
	private static void practice02() {
		// TODO Auto-generated method stub
		System.out.println("===============2번 프로그램 시작=================");
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.print("첫 번째 숫자 : ");
			int num2 = Integer.parseInt(scanner.nextLine());
			
			if (num1 <= 0 || num2 <= 0) {System.out.println("1 이상의 숫자를 입력해주세요");}
			else {
				if (num1 > num2) {
					int temp = num2;
					num2 = num1;
					num1 = temp;
				}
				for (int i = num1; i <= num2; i++) {
					System.out.printf("%d ", i);
				}
				break;
			}
		}
		System.out.println("\n===============2번 프로그램 종료=================");
	}
	
	private static void practice03() {
		// TODO Auto-generated method stub
		System.out.println("===============3번 프로그램 시작=================");
		while(true) {
			System.out.print("정수 입력 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
	
			if (num1 <= 0) {System.out.println("1 이상의 숫자를 입력해주세요");}
			else {
				for (int i = 0; i < num1; i++) {
					for (int j = 0; j < i+1; j++) {
						System.out.printf("%c", '★');
					}
					System.out.println();
				}
				break;
			}
		}
		System.out.println("\n===============3번 프로그램 종료=================");
	}
	
	private static void practice04() {
		// TODO Auto-generated method stub
		System.out.println("===============4번 프로그램 시작=================");
		while(true) {
			System.out.print("정수 입력 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
	
			if (num1 <= 0) {System.out.println("1 이상의 숫자를 입력해주세요");}
			else {
				for (int i = 0; i < num1; i++) {
					for (int j = 0; j < -i + num1; j++) {
						System.out.print(" ");
//						System.out.printf("%c", '★');
					}
					for (int k = 0; k < 2*i+1; k++) {
						System.out.printf("%c", '★');
					}
					System.out.println();
				}
				break;
			}
		}
		System.out.println("\n===============4번 프로그램 종료=================");		
	}

	private static void practice05() {
		// TODO Auto-generated method stub
		System.out.println("===============5번 프로그램 시작=================");
		while(true) {
			System.out.print("정수 입력 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
	
			if (num1 <= 0) {System.out.println("1 이상의 숫자를 입력해주세요");}
			else {
				for (int i = 0; i < num1; i++) {
					for (int j = 0; j < -i+num1; j++) {
						System.out.printf("%c", '★');
					}
					System.out.println();
				}
				break;
			}
		}
		System.out.println("\n===============5번 프로그램 종료=================");		

	}
	
}


