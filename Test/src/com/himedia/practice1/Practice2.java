package com.himedia.practice1;
import java.util.Scanner;

public class Practice2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.println("덧셈  : " + (num1 + num2));
		System.out.println("뺄셈  : " + (num1 - num2));
		System.out.println("곱셈  : " + (num1 * num2));
		System.out.println("나눗셈 몫 : " + (num1 / num2));
		System.out.println("나눗셈 나머지 : " + (num1 % num2));

		sc.close();
	}

}
