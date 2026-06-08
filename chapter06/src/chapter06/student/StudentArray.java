package chapter06.student;

import java.util.Scanner;

public class StudentArray {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// 이름 번호 학번 국어 수학 영어
		// 총점 출력
		String[] name = new String[3];
		int[] kor =new int[3], math = new int[3], eng = new int[3], sum = new int[3];
		
		for (int i = 0; i < name.length; i++) {
			System.out.printf("name[%d] >> ", i);
			name[i] = scanner.nextLine();
			
			System.out.printf("Kor[%d] >> ", i);
			kor[i] = Integer.parseInt( scanner.nextLine() );
			
			System.out.printf("Math[%d] >> ", i);
			math[i] = Integer.parseInt( scanner.nextLine() );
			
			System.out.printf("Eng[%d] >> ", i);
			eng[i] = Integer.parseInt( scanner.nextLine() );
			
			sum[i] = sumCalc(kor[i], math[i], eng[i]);
//			sum[i] = kor[i] + math[i] + eng[i];
		}
		
		
		for (int i = 0; i < name.length; i++) {
			System.out.printf("Name[%d] : %-5s %-5d %-5d %-5d %-5d\n", i, name[i], kor[i], math[i], eng[i], sum[i]);
		}
		
		
		
		
		
		if (scanner != null) scanner.close();
		System.out.println("프로그램 종료");		
	}
	
	
	
	private static int sumCalc(int kor, int math, int eng) {
		int sum = kor + math + eng;
		return sum;
	}

}
