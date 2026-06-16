package mvc.practice02;

import java.util.Scanner;

import mvc.practice02.view.BookMenu;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		BookMenu bm = new BookMenu();
		
		bm.display();
		
		if(scan != null) scan.close();
	}
}
