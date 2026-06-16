package chapter12.practice06.view;

import chapter12.practice06.Run;
import chapter12.practice06.controller.BookController;
import chapter12.practice06.model.Book;

public class BookMenu {
	private BookController bc;

	public BookMenu() {
		super();
		this.bc = new BookController();
	}

	public void bookInfoDisplay() {

		boolean exitFlag = false;

		while (!exitFlag) {
			System.out.println("============== 프로그램 시작 ==============");
			System.out.println("0:종료, 1:입력, 2:출력, 3:정렬, 4:총계, 5:평균, 6:검색");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(Run.scanner.nextLine());

			switch (no) {
			case 0:
				exitFlag = true;
				break;
			case 1:
				insertBook();
				break;
			case 2:
				selectBook();
				break;
			case 3:
				sortBook();
				break;
			case 4:
				sumRentCount();
				break;
			case 5:
				avgRentCount();
				break;
			case 6:
				searchBookTitle();
				break;
			default:
				System.out.println("잘못된 번호 입력");
				break;
			}// end switch
		} // end while
		System.out.println("============== 프로그램 종료 ==============");
	}

	private void insertBook() {
		System.out.println("============== 도서 정보 입력 =============");
		bc.insertBook();
	}

	private void selectBook() {
		System.out.println("============== 도서 정보 출력 =============");
		Book[] bArr = bc.selectBook();
//		if (bArr = )
		for (Book book : bArr) {
			System.out.printf("%s \n", book.toString());
		}
	}

	private void sortBook() {
		System.out.println("============== 도서 숫자 정렬 =============");
		Book[] bArr = bc.sortBook();
		for (Book book : bArr) {
			System.out.println(book.toString());
		}
	}

	private void sumRentCount() {
		System.out.println("============== 대여 통계 출력 =============");
		int sum = bc.sumRentCount();
		System.out.printf("총 대여수 : %d \n", sum);
	}

	private void avgRentCount() {
		System.out.println("============== 대여 통계 출력 =============");
		double[] sumAvgArr = bc.sumAvg();
		System.out.printf("대여 횟수 합계 : %5.1f \n", sumAvgArr[0]);
		System.out.printf("대여 횟수 평균 : %5.1f \n", sumAvgArr[1]);
	}

	private void searchBookTitle() {
		System.out.println("============== 도서 이름 검색 =============");
		System.out.print("검색할 책 제목 입력 : ");
		String title = Run.scanner.nextLine();
		Book book = bc.searchBookTitle(title);
		
		if (book != null) {
			System.out.printf("책 제목 : %s 찾았습니다.\n책정보 : %s\n", title, book.toString());
		} else {
			System.out.printf("책 제목 : %s 못 찾았습니다.\n", title);
		}
	}

//	private void setGrade() {
//		System.out.println("============ 도서 대여 횟수 정렬 ===========");
//		for (int i = 0; i < bArr.length; i++) {
//			if (bArr[i].getRentCount() > bcm.getCUT_LINE())
//				System.out.printf("%s - 인기도서입니다 \n", bArr[i].getTitle());
//			else
//				System.out.printf("%s - 일반도서 \n", bArr[i].getTitle());
//		}
//	}

}
