package mvc.practice02.view;

import mvc.practice02.model.Book;
import mvc.practice02.Run;
import mvc.practice02.controller.BookController;

public class BookMenu {
	private BookController bcm;
	private Book[] bArr;
	
	public BookMenu() {
		super();
		this.bcm = new BookController();
		bArr = bcm.printBook();
	}
		
	public void display() {
		
		boolean exitFlag = false;
		
		while (!exitFlag) {
			System.out.println("============== 프로그램 시작 ==============");
			System.out.println("0:종료, 1:정보, 2:통계, 3:등급, 4:정렬, 5:검색");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(Run.scan.nextLine());
			
			switch (no) {
			case 0:
				exitFlag = true;
				break;
			case 1:
				System.out.println("============== 도서 정보 출력 =============");
				printBookInform();
				break;
			case 2:
				System.out.println("============== 대여 통계 출력 =============");
				avgRentCount();
				break;
			case 3:	
				System.out.println("============== 도서 등급 판별 =============");
				setGrade();
				break;
			case 4:	
				System.out.println("============ 도서 대여 횟수 정렬 ===========");
				sortBook();	
				break;
			case 5:	
				System.out.println("============== 도서 이름 검색 =============");
				searchBook();
				break;
			default:
				System.out.println("잘못된 번호 입력");
				break;
			}// end switch
		}
		System.out.println("============== 프로그램 종료 ==============");
	}

	private void printBookInform() {
		for (Book book : bArr) {
			System.out.printf("%s \n", book.inform());
		}
	}

	private void avgRentCount() {
		double[] avg = bcm.avgRentCount();
		System.out.printf("대여 횟수 합계 : %5.1f \n", avg[0]);
		System.out.printf("대여 횟수 평균 : %5.1f \n", avg[1]);	
	}

	private void setGrade() {
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i].getRentCount() > bcm.getCUT_LINE())
				System.out.printf("%s - 인기도서입니다 \n", bArr[i].getTitle());
			else System.out.printf("%s - 일반도서 \n", bArr[i].getTitle());
		}
	}

	private void sortBook() {
		bcm.sortRentCount();
		printBookInform();
	}

	private void searchBook() {
		System.out.print("검색할 도서명 입력 : ");
		String search = Run.scan.nextLine();
		
		boolean searchFlag = false;
		for (int i = 0; i < bArr.length; i++) {
			if(bArr[i].getTitle().equals(search)) {
				searchFlag = true;
				break;
			}
		}
		if (!searchFlag) {
			System.out.printf("%s 의 재고가 없습니다\n", search);
		} 
		else {
			System.out.printf("%s 의 재고가 있습니다\n", search);
		}	
	}
		
}
