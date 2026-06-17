package mvc.practice03.view;

import mvc.practice03.Run;
import mvc.practice03.controller.BookController;
import mvc.practice03.model.Book;

public class BookMenu {
	private BookController bc;

	public BookMenu() {
		super();
		this.bc = new BookController();
	}
	
	public void display() {
		boolean exitFlag = false;

		while (!exitFlag) {
			System.out.println("============== 프로그램시작 ==============");
			System.out.println("0:종료, 1:입력, 2:출력, 3:정렬, 4:총계, 5:평균, 6:검색, 7:순위");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(Run.scan.nextLine());

			switch (no) {
			case 0:
				exitFlag = true;
				break;
			case 1:
				setBookList();
				break;
			case 2:
				getBookList();
				break;
			case 3:
				sortBookList();
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
			case 7:
				rankBookTitle();
				break;
			default:
				System.out.println("잘못된 번호 입력");
				break;
			}// end switch
		} // end while
		
		System.out.println("============== 프로그램종료 ==============");
	} // end func (display) 

	private void setBookList() {
		System.out.println("============== 도서정보입력 ==============");
		boolean checkNull = bc.setBookList();
		
		if(checkNull)
			System.out.println("입력완료");
		else
			System.out.println("Null 값");
	} // end func (insertBook)
	
	private void getBookList() {
		System.out.println("============== 도서정보출력 ==============");
		Book[] bArr = bc.getbArr();
		
		for (Book book : bArr) {
			System.out.printf("%s\n", book.toString());
		}
	} // end func (getBookList)

	private void sortBookList() {
		System.out.println("============== 도서정보정렬 ==============");	
		Book[] copybArr = bc.sortBookList();
		
		for (Book book : copybArr) {
			System.out.printf("%s\n", book.toString());
		}
	} // end func (sortBookList)

	private void sumRentCount() {
		System.out.println("============== 대여량 합계 ==============");
		System.out.printf("총대여합계 : %d\n", bc.sumRentCount());
	} // end func (sumRentCount)

	private void avgRentCount() {
		System.out.println("============== 대여량 평균 ==============");
		System.out.printf("총대여평균 : %5.2f\n", bc.avgRentCount());		
	} // end func (avgRentCount)

	private void searchBookTitle() {
		System.out.println("============== 도서정보검색 ==============");
		System.out.print("검색어 입력 : ");
		String strSearch = Run.scan.nextLine();
		
		Book tempBook = bc.searchBookTitle(strSearch);
		
		if(tempBook == null)
			System.out.printf("%s : 없습니다\n", strSearch);
		else {
			System.out.printf("%s : 있습니다\n", strSearch);
			System.out.printf("%s\n", tempBook.toString());
		}
	} // end func (searchBookTitle)

	private void rankBookTitle() {
		System.out.println("============== 도서랭크출력 ==============");
		String[] temp = new String[5];
		
		temp = bc.rankBookTitle();
		
		for (String string : temp) {
			System.out.printf("%s\n", string);
		}
	}

	
} // end class
