package chapter04;

import java.util.Scanner;

public class SwitchTest {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switchi case문에 break 유뮤의 차이
		
		System.out.print("input no(1~5) : ");
		int no = Integer.parseInt(scan.nextLine());
		
		switch (no) {
		case 1:
			System.out.println("A");
//			break;
		case 2:
			System.out.println("B");
//			break;
		case 3:
			System.out.println("C");
//			break;
		case 4:
			System.out.println("D");
//			break;
		default:
			System.out.println("해당사항 없음");
			break;
		}
		
		scan.close();
		System.out.println("end program");
		
	}

}
