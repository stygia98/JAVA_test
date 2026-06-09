package chapter12.practice05.view;

import chapter12.practice05.controller.BookController;
import chapter12.practice05.model.BookVo;

public class BookMenu {
	private BookController bookCon;
	
	public BookMenu() {
		bookCon = new BookController();
		BookVo[] bookArray = bookCon.printBook();

		System.out.println("========== 도서 정보 출력 ==========");
		for (BookVo bookVo : bookArray) {
			System.out.printf("%s\n", bookVo.inform());
		}
		System.out.println();
		
		System.out.println("========== 대여 통계 출력 ==========");
		double[] temp = bookCon.avgRentCount();
		System.out.printf("전체 도서 대여 횟수 합계 : %5.0f\n", temp[0]);
		System.out.printf("전체 도서 대여 횟수 평균 : %5.1f\n", temp[1]);
		System.out.println();
		
		System.out.println("========== 도서 등급 판별 ==========");
		for (int i = 0; i < bookArray.length; i++) {
			String grade = (bookArray[i].getRentCount() > bookCon.getCUT_LINE())? "일반도서" : "인기도서(Best Seller)";
			System.out.printf("%s(은)는 %s입니다\n", bookArray[i].getTitle(), grade);
		}
		
	}//end constructor
	
}//end class
