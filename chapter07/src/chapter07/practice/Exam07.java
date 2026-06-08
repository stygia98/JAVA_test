package chapter07.practice;

import java.util.Scanner;

public class Exam07 {
	static Scanner scanner = new Scanner(System.in); // 스캐너 생성
	
	public static void main(String[] args) {
		boolean flagExit = false;
		
		while(!flagExit) {
			System.out.println("0:프로그램종료, 1:1번문제, 2:2번문제");
			System.out.print("번호입력 : ");
			int select1 = Integer.parseInt(scanner.nextLine());
		
			switch(select1) {
				case 1: practice01(); break;
				case 2: practice02(); break;
				case 0: System.out.println("프로그램 종료"); flagExit=true; break;
				default: System.out.println("잘못된 값 입력"); break;
			} // end switch
		} // end while
		if(scanner!=null) scanner.close(); // 스캐너 제거
	} // end main
	
	//실습문제1
	private static void practice01() {
//		Product product01 = new Product("아이폰16", 1000000, "애플");
		Product product01 = new Product();
		product01.setProductName("아이폰16");
		product01.setPrice(1_000_000);
		product01.setBrand("애플");
		product01.information();
		
		Product product02 = new Product();
		product02.setProductName("갤럭시");
		product02.setPrice(1_350_000);
		product02.setBrand("삼성");
		product02.information();
		
		Product product03 = new Product();
		System.out.print("상품명 입력 : ");
		product03.setProductName(scanner.nextLine());
		System.out.print("가격 입력 : ");
		product03.setPrice(Integer.parseInt(scanner.nextLine()));
		System.out.print("브랜드명 입력 : ");
		product03.setBrand(scanner.nextLine());
		product03.information();
		
	}// end function
	
	private static void practice02() {
		
		Book[] bookArray = new Book[4];
		
//		bookArray[0] = new Book("객체지향의 사실과 오해", "조영호", "위키북스", 25000, 0.1);
//		bookArray[1] = new Book("클린 코드", "로버트 C.", "인사이트", 38000, 0.15);
//		bookArray[2] = new Book("실용주의 프로그래머", "앤드류 헌트, 데이비드 토마스", "인사이트", 35000, 0.15);

		bookArray[0] = new Book();
		bookArray[0].setTitle("객체지향의 사실과 오해");
		bookArray[0].setAuthor("조영호");
		bookArray[0].setPublisher("위키북스");
		bookArray[0].setPrice(25000);
		bookArray[0].setDiscountRate(0.1);
		
		bookArray[1] = new Book();
		bookArray[1].setTitle("클린 코드");
		bookArray[1].setAuthor("로버트 C.");
		bookArray[1].setPublisher("인사이트");
		bookArray[1].setPrice(38000);
		bookArray[1].setDiscountRate(0.15);

		bookArray[2] = new Book();
		bookArray[2].setTitle("실용주의 프로그래머");
		bookArray[2].setAuthor("앤드류 헌트, 데이비드 토마스");
		bookArray[2].setPublisher("인사이트");
		bookArray[2].setPrice(35000);
		bookArray[2].setDiscountRate(0.15);
		
		bookArray[0].inform();
		bookArray[1].inform();
		bookArray[2].inform();

//		System.out.printf("도서명 : %s 저자명 : %s 출판사 : %s 가격 : %d 할인율 : %5.2f\n", bookArray[0].getTitle(), bookArray[0].getAuthor(), bookArray[0].getPublisher(), bookArray[0].getPrice(), bookArray[0].getDiscountRate());
		
		bookArray[3] = new Book();
		System.out.print("도서명 입력 : ");
		bookArray[3].setTitle(scanner.nextLine());
		System.out.print("저자 입력 : ");
		bookArray[3].setAuthor(scanner.nextLine());
		System.out.print("출판사 입력 : ");
		bookArray[3].setPublisher(scanner.nextLine());
		System.out.print("가격 입력 : ");
		bookArray[3].setPrice(Integer.parseInt(scanner.nextLine()));
		System.out.print("할인율 입력 : ");
		bookArray[3].setDiscountRate(Double.parseDouble(scanner.nextLine()));
		
		bookArray[3].inform();

	}// end function

}
