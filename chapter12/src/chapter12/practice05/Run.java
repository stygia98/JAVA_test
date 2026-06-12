package chapter12.practice05;

import java.util.Scanner;

import chapter12.practice05.view.BookMenu2;
//import chapter12.practice05.view.BookMenu;

public class Run {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
//		@SuppressWarnings("unused")
//		BookMenu bookMenu = new BookMenu();
//		BookMenu2 bookMenu2 = new BookMenu2();

		boolean exitFlag = false;
		while(!exitFlag){
			System.out.println("1:도서, 2:판매, 3:회원관리, 6:종료");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(scanner.nextLine());
			switch (no) {
			case 1:
				BookMenu2 bookMenu2 = new BookMenu2();
				bookMenu2.bookDisplay();
				break;
			case 2:
				System.out.println("도서판매는 작업중");
				break;
			case 3:
				System.out.println("회원관리는 작업중");
				break;
			case 6:
				System.out.println("프로그램 종료");
				exitFlag = true;
				break;
			default:
				System.out.println("비정상적인 번호 입력됨");
				exitFlag = true;
				break;
			}
		}
		
		if(scanner != null) scanner.close();
		System.out.println("저희사이트를 방문해주셔서 감사합니다");
		
	}

}
