package mvc.practice01.view;

import mvc.practice01.Run;
import mvc.practice01.controller.BookController;
import mvc.practice01.model.Book;

public class BookMenu {
	private BookController bc;

	public BookMenu() {
		super();
		bc = new BookController();
	}
	
	public void bookInfoDisplay() {
		
		boolean exitFlag = false;
		
		while(!exitFlag) {
			System.out.println("1:책정보, 2:순위정렬, 3:총대여수, 4:대여량정보, 5:HOME");
			System.out.printf("번호 입력 : ");
			int no = Integer.parseInt(Run.scan.nextLine());
			
			switch (no) {
			case 1:
				printBook(); //1. 책정보
				break;
			case 2:
				sortRentCount(); //2. 순위정렬
				break;
			case 3:
				sumRentCount(); //3. 대여수
				break;
			case 4:
				avgRentCount(); //4. 총대여수 & 평균
				break;
			case 5:
				exitFlag = true; //5. ReturnHOME
				break;
			default:
				System.out.println("잘못된 번호, 다시 입력");
				break;
			}
		}
	}
	
	public void printBook() {
		Book[] bArr = bc.printBook();
		
		for (Book book : bArr) {
			System.out.println(book.toString());
		}
	}
	
	public void sortRentCount() {
		Book[] bArr = bc.sortRentCount();
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i].toString());
		}
	}

	public void sumRentCount() {
		System.out.printf("총 대여수 : %d\n", bc.sumRentCount());
	}
	
	public void avgRentCount() {
		double[] sumAvgArr = bc.avgRentCount();
		System.out.printf("총대여수: %5.1f / 대여수평균: %5.1f\n", sumAvgArr[0], sumAvgArr[1]);
	}
}
