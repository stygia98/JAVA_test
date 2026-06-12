package mvc.practice01;

import java.util.Scanner;

import mvc.practice01.view.BookMenu;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false;
		while(!exitFlag){
			System.out.println("1:도서, 2:판매, 3:회원관리, 6:종료");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(scan.nextLine());
			switch (no) {
			case 1:
				BookMenu bookMenu2 = new BookMenu();
				bookMenu2.bookInfoDisplay();
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

		try { if(scan != null) scan.close(); } 
		catch (Exception e) { } 
		finally { scan.close(); }
	}

}
