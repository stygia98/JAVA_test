package chapter06;

import java.util.Scanner;

public class Rectangle2Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle2Class[] recArray = new Rectangle2Class[3];
		
		for (int i = 0; i < recArray.length; i++) {
			System.out.printf("너비 입력[%d] : ", i);
			double width = Double.parseDouble(scanner.nextLine());
			System.out.printf("높이 입력[%d] : ", i);
			double height = Double.parseDouble(scanner.nextLine());

			recArray[i] = new Rectangle2Class(width, height);
		}
		
		for (int i = 0; i < recArray.length; i++) {
			recArray[i].calcArea();
		}
		
		for (int i = 0; i < recArray.length; i++) {
			recArray[i].printArea();
		}
		
	}

}
