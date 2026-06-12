package mvc.practice01.controller;

import mvc.practice01.model.Book;

// 업무처리 (사용자 요청 -> DB요청 -> 화면에 맞게 조작)
public class BookController {
	private Book[] bArr;
	public static final int BOOK_COUNT;
	public static final int CUT_LINE;
	
	static {
		BOOK_COUNT = 5;
		CUT_LINE = 30;
	}

	public BookController() {
		super();
		bArr = new Book[BOOK_COUNT];
		bArr[0] = new Book("자바의정석", "IT", 45);
		bArr[1] = new Book("혼공 C언어", "IT", 15);
		bArr[2] = new Book("피프티 피플", "소설", 50);
		bArr[3] = new Book("꿈 백화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}

	public Book[] printBook() {
		return bArr;
	}
	
	public int sumRentCount() {
		int sum = 0;
		for (Book book : bArr) {
			sum =+ book.getRentCount();
		}
		return sum;
	}

	public double[] avgRentCount() {
		double[] sumAvgArr = new double[2];
		sumAvgArr[0] = (double)sumRentCount();
		sumAvgArr[1] = sumAvgArr[0] / BOOK_COUNT;
		return sumAvgArr;
	}
	
	public Book[] sortRentCount() {	
		for (int j = 0; j < bArr.length-1; j++) {
			for (int i = j; i < bArr.length; i++) {
				if (bArr[j].getRentCount() < bArr[i].getRentCount()) {
					Book temp = bArr[j];
					bArr[j] = bArr[i];
					bArr[i] = temp;
				}//end if
			}// end for
		}// end for
		return bArr;
	}//end func sortRentCount()
	
			
}
