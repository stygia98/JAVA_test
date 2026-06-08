package com.himedia.practice1;
import java.util.Scanner;

public class Practice1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("이름입력");
		String name = sc.nextLine();
		System.out.print("성별입력");
		char gender = sc.nextLine().charAt(0);
		System.out.print("나이 입력");
		int age = sc.nextInt();
		System.out.print("키 입력");
		double height = sc.nextDouble();

		System.out.printf("키 %.1f cm인 %d살 %c %s님 반갑습니다", height , age, gender, name);
		sc.close();
	}

}
