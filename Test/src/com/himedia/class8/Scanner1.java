package com.himedia.class8;

import java.util.Scanner;

public class Scanner1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로 문자 하나를 입력 받아 그 문자의 정수 값(유니코드)을 출력하세요.
		System.out.print("혈액형 입력 : ");
		char bloodType = (sc.nextLine()).charAt(0);
		
		System.out.printf("혈액형 타입 : %c\n유니코드값 : %d", bloodType, (int)bloodType);
		
	}

}
