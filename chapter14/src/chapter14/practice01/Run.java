package chapter14.practice01;

import java.util.Scanner;

public class Run {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double value = 0.0;	
		int num;
		boolean exitFlag = false;
		
		while(!exitFlag) {
			System.out.printf("숫자입력(0값제외):");
			num = Integer.parseInt(scanner.nextLine());

			try {
				System.out.println("100문장 실행");
				value = 10 / num;
				exitFlag = true;
				System.out.println("100문장 실행");

			} catch (Exception e) {
				System.out.println("입력된 값으로는 계산이 불가능");
				e.printStackTrace();
			}
		}
		System.out.printf("결과값 %5.2f\n", value);
		
		if(scanner != null) scanner.close();
		
		System.out.println("end");
	}

}
