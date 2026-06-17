package chapter12.practice07;

import java.util.Scanner;

import chapter12.practice07.view.StudentMenu;

public class Run {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		StudentMenu sm = new StudentMenu();
		sm.studentInfoDisplay();
		
		if (scanner != null) scanner.close();
		System.out.println("============ 메인 프로그램 종료 ============");
	}
}
