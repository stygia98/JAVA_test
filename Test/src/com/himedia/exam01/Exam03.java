package com.himedia.exam01;

import java.util.Scanner;

public class Exam03 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		for ( ; true ; ) {
			System.out.println("=============================================");
			System.out.println("0: exit / 1: 1번문제 / 2: 2번문제 / 3: 3번문제 / 4: 4번문제");
			System.out.println("=============================================");
			System.out.print("번호 입력 : ");
			
			int select1 = Integer.parseInt(scanner.nextLine());
			
			switch (select1) {
				case 0: break;
				case 1: practice01(); break;
				case 2: practice02(); break;
				case 3: practice03(); break;
				case 4: practice04(); break;
				case 5: practice05(); break;

				default: System.out.println("이상한 값 입력됨"); break;
			}
			
			if (select1 == 0) { System.out.println("프로그램 종료"); break; }
			else continue;
		}
		if(scanner != null) scanner.close();
	}
	
	private static void practice05() {
		// TODO Auto-generated method stub
		
	}

	private static void practice01() {
		// TODO Auto-generated method stub
		System.out.println("=============================================");
		System.out.println("1번문제 시작");
		System.out.println("=============================================");
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO 메뉴입니다.”를 출력하고,
		//종료 번호를 누르면 “프로그램이 종료됩니다.“를 출력하세요.
		for ( ; ; ) {
			System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료");
			System.out.print("메뉴 번호를 입력 : ");
			int menu1 = Integer.parseInt(scanner.nextLine());
			
			switch (menu1) {
				case 1: System.out.println("입력 메뉴 입니다.\n"); break;
				case 2: System.out.println("수정 메뉴 입니다.\n"); break;
				case 3: System.out.println("조회 메뉴 입니다.\n"); break;
				case 4: System.out.println("삭제 메뉴 입니다.\n"); break;
				case 7: System.out.println("프로그램이 종료 됩니다.\n"); break;
				default: System.out.println("잘못된 값 입력.\n"); break;
			}
			if ( menu1==7 ) break;
			else continue;
		}
		System.out.println("1번문제 종료");
	}
	private static void practice02() {
		// TODO Auto-generated method stub
		System.out.println("=============================================");
		System.out.println("2번문제 시작");
		System.out.println("=============================================");
		//키보드로 입력 받은 정수 값이 양수이면서 짝수인 경우 “짝수다”를 출력하고
		//짝수가 아니면 “홀수다”를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요“
		while(true) {
			System.out.print("숫자 한 개를 입력하세요 : ");
			int num = Integer.parseInt(scanner.nextLine());
			
			if (num == 0) System.out.println("0은 양수도 음수도 아닙니다");
			else if (num < 0) System.out.println("양수만 입력해주세요");
			else {
				if (num%2==0) { System.out.println("짝수다"); break; }
				else { System.out.println("홀수다"); break; }
			}
		}
		
		System.out.println("2번문제 종료");
	}
	private static void practice03() {
		// TODO Auto-generated method stub
//		키보드로부터 점수를 입력 받아, 아래 기준에 따라 학점을 출력하세요.
//		- 점수 범위 : 0 ~ 100. 점수 범위를 벗어날 경우 “점수를 올바르게 입력해주세요.” 출력
//		- 90점 이상 : A - 80점 이상 : B - 70점 이상 : C - 70점 미만 : F
		System.out.println("=============================================");
		System.out.println("3번문제 시작");
		System.out.println("=============================================");

		for( ; ; ) {
			System.out.print("점수를 입력하세요(0~100) : ");
			int score1 = Integer.parseInt(scanner.nextLine());
			int select1 = score1/10;
			
			if (score1 > 100 || score1 < 0 ) { System.out.println("점수를 올바르게 입력해주세요."); break; }
			else {
				switch (select1) {
					case 10: case 9:
						System.out.println("A"); break;
					case 8:
						System.out.println("B"); break;
					case 7:
						System.out.println("C"); break;
					default: 
						System.out.println("F"); break;
				}
			}
		}
		
		
//		if (score1 > 100) { System.out.println("점수를 올바르게 입력해주세요."); }
//		else if (score1 >= 90) { System.out.println("A"); }
//		else if (score1 >= 80) { System.out.println("B"); }
//		else if (score1 >= 70) { System.out.println("C"); }
//		else if (score1 < 70 && score1 >= 0) { System.out.println("F"); }
//		else { System.out.println("점수를 올바르게 입력해주세요."); }
		
		System.out.println("3번문제 종료");
	}
	private static void practice04() {
//		키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
//		(단, 두 개의 정수 모두 양수일 때만 작동하며
//		없는 연산 기호를 입력했을 시 “잘못 입력하였습니다. 프로그램을 종료합니다.” 출력)
		System.out.println("=============================================");
		System.out.println("4번문제 시작");
		System.out.println("=============================================");
		
		
		System.out.print("피연산자1 입력 : ");
		float num1 = Float.parseFloat(scanner.nextLine());
		System.out.print("피연산자2 입력 : ");
		float num2 = Float.parseFloat(scanner.nextLine());
		String oper1 = null;
		
		boolean exitFlag = false;
		while(!exitFlag) {
			System.out.print("연산자 입력 (+, -, *, /, %) : ");
			oper1 = String.valueOf(scanner.nextLine().charAt(0));
			if (oper1.equals("+") || oper1.equals("-") || oper1.equals("*") 
					|| oper1.equals("/") || oper1.equals("%")) exitFlag = true;
			else System.out.println("잘못된 연산자 입력됨");
		}
		
		switch (oper1) {
			case "+": System.out.printf("%.1f %s %.1f = %.1f \n", num1, oper1, num2, num1 + num2); break;
			case "-": System.out.printf("%.1f %s %.1f = %.1f \n", num1, oper1, num2, num1 - num2); break;
			case "*": System.out.printf("%.1f %s %.1f = %.1f \n", num1, oper1, num2, num1 * num2); break;
			case "/": System.out.printf("%.1f %s %.1f = %.1f \n", num1, oper1, num2, num1 / num2); break;
			case "%": System.out.printf("%.1f %s %.1f = %.1f \n", num1, oper1, num2, num1 % num2); break;
			default: System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다"); break;
		}
		
		
//		System.out.print("연산자 입력 (+, -, *, /, %) : ");
//		char oper1 = scanner.nextLine().charAt(0);
//
//		switch (oper1) {
//			case '+': System.out.printf("%.1f %c %.1f = %.1f \n", num1, oper1, num2, num1 + num2); break;
//			case '-': System.out.printf("%.1f %c %.1f = %.1f \n", num1, oper1, num2, num1 - num2); break;
//			case '*': System.out.printf("%.1f %c %.1f = %.1f \n", num1, oper1, num2, num1 * num2); break;
//			case '/': System.out.printf("%.1f %c %.1f = %.1f \n", num1, oper1, num2, num1 / num2); break;
//			case '%': System.out.printf("%.1f %c %.1f = %.1f \n", num1, oper1, num2, num1 % num2); break;
//			default: System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다"); break;
//		}
		System.out.println("4번문제 종료");
	}



}


