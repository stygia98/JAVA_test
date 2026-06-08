package chapter06;

import java.util.Scanner;

public class Rectangle1Array {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사각형 면적 구하기
		
//		double width = 0;
//		double height = 0;
//		double areaSquare = 0;
//		
//		System.out.print("너비 입력 : ");
//		width = Double.parseDouble(scanner.nextLine());
//		System.out.print("높이 입력 : ");
//		height = Double.parseDouble(scanner.nextLine());
//
//		areaSquare = width * height;
//		
//		System.out.printf("폭 : %-5.2f / 높이 : %-5.2f / 면적 : %-5.2f", width, height, areaSquare);
		
		double[] width1 = new double[3];
		double[] height1 = new double[3];
		double[] areaSquare1 = new double[3];

		for (int i = 0; i < areaSquare1.length; i++) {
			System.out.printf("너비 입력[%d] : ", i);
			width1[i] = Double.parseDouble(scanner.nextLine());
			System.out.printf("높이 입력[%d] : ", i);
			height1[i] = Double.parseDouble(scanner.nextLine());
			
			areaSquare1[i] = width1[i] * height1[i];
		}
		
		
		for (int i = 0; i < areaSquare1.length; i++) {
			System.out.printf("폭[%d] : %-5.2f / 높이[%d] : %-5.2f / 면적[%d] : %-5.2f\n", i, width1[i], i, height1[i], i, areaSquare1[i]);
		}
		
		if(scanner != null) scanner.close();
		
	}

}
