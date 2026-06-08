package com.himedia.exam01;

import java.util.Scanner;

public class Exam02 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		for ( ; true ; ) {
//		while ( true ) {
			//문제 번호 출력
			System.out.println();
			System.out.println("0:exit");
			System.out.println("1:음수양수, 2:양수0음수, 3:홀짝구분, 4:사탕나누기, 5:프로필");
			System.out.println("6:나이판별, 7:합/불합 판별, 8:주민번호 판별, 9:3개숫자비교, 10:인센계산");
			System.out.print(">>");
			
			//문제 번호 선택
			int no = Integer.parseInt(scanner.nextLine());
			System.out.println();

			// 실행하는 함수 선택
			switch (no) {
				case 0:	break;
				case 1: practice1(); break;
				case 2: practice2(); break;
				case 3: practice3(); break;
				case 4: practice4(); break;
				case 5: practice5(); break;
				case 6: practice6(); break;
				case 7: practice7(); break;
				case 8: practice8(); break;
				case 9: practice9(); break;
				case 10: practice10(); break;
				default: System.out.println("잘못된 값 입력"); break;
			}
			
			//무한 반복 종료
//			if ( no < 1 || no > 10 ) {
			if ( no == 0 ) {
				System.out.println("종료");
				break;
			}
		}
		//자원반납
		if( scanner != null ) {
			scanner.close();
		}
	}
	
	
	private static void practice10() {
		System.out.println("10번문제 시작");
		
		// a 의 인센 0.4 / b 의 인센 없음 / c 의 인센 0.15
		System.out.print("A사원 연봉>>");
		float num1 = Float.parseFloat(scanner.nextLine());
		System.out.print("B사원 연봉>>");
		float num2 = Float.parseFloat(scanner.nextLine());
		System.out.print("C사원 연봉>>");
		float num3 = Float.parseFloat(scanner.nextLine());

		System.out.printf("A 사원 연봉/연봉+a : %.0f/%.1f\n", num1, num1*1.4);
		if (num1*1.4 >= 3000) { System.out.println("3000 이상"); }
		else { System.out.println("3000 미만"); }
		
		System.out.printf("A 사원 연봉/연봉+a : %.0f/%.1f\n",num2, num2);
		if (num2 >= 3000) { System.out.println("3000 이상"); }
		else { System.out.println("3000 미만"); }

		System.out.printf("A 사원 연봉/연봉+a : %.0f/%.1f\n",num3, num3*1.15);
		if (num3*1.15 >= 3000) { System.out.println("3000 이상"); }
		else { System.out.println("3000 미만"); }
	}
	
	
	private static void practice9() {
		System.out.println("9번문제 시작");
		
		// 숫자3개 비교
		System.out.print("입력1>>");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("입력2>>");
		int num2 = Integer.parseInt(scanner.nextLine());
		System.out.print("입력3>>");
		int num3 = Integer.parseInt(scanner.nextLine());

		if ( num1 == num2 && num2 == num3 && num1 == num3 ) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	
	private static void practice8() {
		System.out.println("8번문제 시작");
		
		//주민번호로 남녀 구분
		System.out.print("주민번호 입력 (-포함)>>");
		String num1 = scanner.nextLine();

		switch ( num1.charAt(7) ) {
			case '1': System.out.println("남자"); break;
			case '2': System.out.println("여자"); break;
			case '3': System.out.println("남자"); break;
			case '4': System.out.println("여자"); break;
			default: break;
		}
		
//		if ( num1.charAt(7)=='1' ) {
//			System.out.println("남자");
//		} else if ( num1.charAt(7)=='2' ) {
//			System.out.println("여자");
//		} else if ( num1.charAt(7)=='3' ) {
//			System.out.println("남자");
//		} else if ( num1.charAt(7)=='4' ) {
//			System.out.println("여자");
//		}
	}
	
	
	private static void practice7() {
		System.out.println("7번문제 시작");
		
		//국영수 입력 합계 평균
		//각과40 평균60 이상 합격
		System.out.print("국어점수입력>>");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.print("수학점수입력>>");
		int math = Integer.parseInt(scanner.nextLine());
		System.out.print("영어점수입력>>");
		int eng = Integer.parseInt(scanner.nextLine());
		
		int sum = kor + math + eng;
		float avr = sum/3;
		
		System.out.printf("합계 : %d\n평균 : %.1f\n", sum, avr);
		
		if(kor >= 40 && math >= 40 && eng >= 40) {
				if(avr >= 60) {
					System.out.println("합격");
				}
				else {
					System.out.println("불합격");
				}
		} 
		else {
				System.out.println("불합격");
		}
	}
	
	
	private static void practice6() {
		System.out.println("6번문제 시작");
		
		//나이 입력 받아 (어린이, 청소년, 성인) 출력
		System.out.print("나이 입력>>");
		int age1 = Integer.parseInt(scanner.nextLine());

		if ( age1 < 13 ) {
			System.out.println("어린이");
		} else if ( age1 < 19 && age1 >= 13 ) {
			System.out.println("청소년");
		} else if ( age1 >= 19 ) {
			System.out.println("성인");
		} else {
			System.out.println("정수 입력 하세요");
		}
	}
	
	private static void practice5() {
		System.out.println("5번문제 시작");
		
		System.out.print("이름>>");
		String name1 = scanner.nextLine();
		System.out.print("학년(숫자만)>>");
		int grade1 = Integer.parseInt(scanner.nextLine());
		System.out.print("반(숫자만)>>");
		int class1 = Integer.parseInt(scanner.nextLine());
		System.out.print("번호(숫자만)>>");
		int number1 = Integer.parseInt(scanner.nextLine());
		System.out.print("성별(M/F)>>");
		char gender1 = scanner.nextLine().charAt(0);
		System.out.print("성적(소숫점둘째까지)>>");
		float grade2 = Float.parseFloat(scanner.nextLine());
		
		String gender2 = "";
		if (gender1 == 'M' || gender1 == 'm') {
			gender2 = "남학생";
		} else if (gender1 == 'F' || gender1 == 'f') {
			gender2 = "여학생";
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %6.2f\n", grade1, class1, number1, name1, gender2, grade2);
	}
	private static void practice4() {
		System.out.println("4번문제 시작");
		
		// 인원 수와 사탕 개수를 입력 받고\n 1인당 사탕 개수와 남은 사탕의 개수 출력
		System.out.print("사탕개수>>");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("인원수>>");
		int num2 = Integer.parseInt(scanner.nextLine());

		System.out.printf("나눠가질 사탕개수 : %d\n", num1/num2);
		System.out.printf("남은 사탕개수 : %d\n", num1%num2);

	}
	private static void practice3() {
		System.out.println("3번문제 시작");
		
		System.out.println("입력 정수가 짝수면 “짝수다”, 아니면 “홀수다”를 출력");
		System.out.print("정수 입력>>");
		int num1 = Integer.parseInt(scanner.nextLine());

		if ( num1 % 2 == 0 ) {
			System.out.println("짝수다");
		} else if ( num1 % 2 != 0 ) {
			System.out.println("홀수다");
		} else if ( num1 == 0 ) {
			System.out.println("0 입력");
		} else {
			System.out.println("정수 입력 하세요");
		}
	}
	
	
	private static void practice2() {
		System.out.println("2번문제 시작");
		
		System.out.println("입력 정수가 양수이면 “양수다”, 아니면 “음수다”를 출력");
		System.out.print("정수 입력>>");
		int num1 = Integer.parseInt(scanner.nextLine());

		if ( num1 > 0 ) {
			System.out.println("양수다");
		} else if ( num1 < 0 ) {
			System.out.println("음수다");
		} else if ( num1 == 0 ) {
			System.out.println("0 입력");
		} else {
			System.out.println("정수 입력 하세요");
		}
	}
	
	
	private static void practice1() {
		System.out.println("1번문제 시작");
		
		System.out.println("입력 정수가 양수이면 “양수다”, 양수가 아니면 “양수가 아니다”를 출력");
		System.out.print(">>");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		if ( num1 > 0 ) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
//		int no = Integer.parseInt(scanner.nextLine().charAt(7)+"");
//		System.out.println(no+1);
		
	}

}
