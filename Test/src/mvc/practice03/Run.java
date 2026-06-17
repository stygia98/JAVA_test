package mvc.practice03;

import java.util.Scanner;

import mvc.practice03.view.BookMenu;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		BookMenu bm = new BookMenu();
		
		bm.display();
		
		if(scan != null) scan.close();
	}
}
