package com.himedia.class8;

import java.util.Scanner;

public class Score1 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("국어 : ");
		double kor = Double.parseDouble(scanner.nextLine());
		System.out.print("수학 : ");
		double math = Double.parseDouble(scanner.nextLine());
		System.out.print("영어 : ");
		double eng = Double.parseDouble(scanner.nextLine());
		
		double sum = kor + eng + math;
		double avr = sum / 3.0;
		
		System.out.printf("kor = %5.1f\nmath = %5.1f\neng = %5.1f\nsum = %d\navr = %d\n",
				kor, math, eng, (int)sum, (int)avr);
		
		if(scanner != null) {
			scanner.close();
		}
		System.out.println("the end");
		
	}

}
