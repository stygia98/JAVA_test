package chapter12.practice05.view;

import chapter12.practice05.Run;
import chapter12.practice05.controller.BookController;
import chapter12.practice05.model.BookVo;

public class BookMenu2 {
	private BookController bcm;
	BookVo[] bookVo;
	
	public BookMenu2() {
		this.bcm = new BookController();
		bookVo = bcm.printBook();
//		bookDisplay();
	}
		
	public void bookDisplay() {
		
		boolean exitFlag = false;
		while(!exitFlag) {
			System.out.println("=================================");
			System.out.println("1:도서정보, 2:대여정보, 3.도서등급, 4:등급정렬, 5:메인화면");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(Run.scanner.nextLine());

			switch(no) {
			case 1:
				System.out.println("========== 도서 정보 출력 ==========");
				for (BookVo bookVo2 : bookVo) {System.out.printf("%s\n", bookVo2.inform());}
				break;
			case 2:
				System.out.println("========== 대여 정보 출력 ==========");
				double[] avgRentCount = bcm.avgRentCount();
				System.out.printf("전체 도서 대여 횟수 합계 : %5.0f\n", avgRentCount[0]);
				System.out.printf("전체 도서 대여 횟수 평균 : %5.1f\n", avgRentCount[1]);
				break;
			case 3:
				System.out.println("========== 도서 등급 판별 ==========");
				for (int i = 0; i < bookVo.length; i++) {
					char grade = 'F';
					
					if (bookVo[i].getRentCount() >= 50) grade = 'A';
					else if (bookVo[i].getRentCount() >= 40) grade = 'B';
					else if (bookVo[i].getRentCount() >= 30) grade = 'C';
					else if (bookVo[i].getRentCount() >= 20) grade = 'D';
					
					System.out.print(bookVo[i].getTitle());
					System.out.printf(" 도서등급 : %s\n", grade);
				}
				break;
			case 4:
				System.out.println("========== 도서 등급 정렬 ==========");
				bcm.sortRentCount();
				for (BookVo bookVo : bookVo) {
					System.out.println(bookVo.inform());
				}
				break;
			case 5:
				System.out.println("============ 메인 화면 ============");
				exitFlag = true;
				break;
			default:
				exitFlag = true;
				break;
			}//end switch
		}//end while	
	}
		
		
//		bcm.sortRentCount();
//		for (int i = 0; i < bookArray.length; i++) {
//			String grade = (bookArray[i].getRentCount() < bcm.getCUT_LINE())? "일반도서" : "인기도서(Best Seller)";
//			System.out.printf("%s(은)는 %s입니다\n", bookArray[i].getTitle(), grade);
		
	
}//end class
