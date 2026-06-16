package chapter12.practice06;

import java.util.Scanner;

import chapter12.practice06.view.BookMenu;

public class Run {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		BookMenu bookMenu = new BookMenu();
		bookMenu.bookInfoDisplay();

		if (scanner != null)
			scanner.close();
	}
}
