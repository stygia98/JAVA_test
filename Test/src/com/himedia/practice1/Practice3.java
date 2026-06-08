package com.himedia.practice1;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력 : ");
		float width1 = sc.nextFloat();
		System.out.print("세로 입력 : ");
		float height1 = sc.nextFloat();
		
		float square = (width1 + height1)*2;
		float area = width1 * height1;
		
		
		System.out.printf("%.1f\n%.1f\n%.2f\n%.2f\n", width1 , height1, area, square);
		
		sc.close();
	}

}
