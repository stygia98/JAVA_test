package chapter12.practice05.controller;

import chapter12.practice05.model.BookVo;

public class BookController extends BookVo {
	private BookVo[] bookArray;
	public final int CUT_LINE;
		
	public BookController() {
		CUT_LINE = 30;
		bookArray = new BookVo[5];
		bookArray[0] = new BookVo("자바의정석", "IT", 45);
		bookArray[1] = new BookVo("혼공 C언어", "IT", 15);
		bookArray[2] = new BookVo("피프티 피플", "소설", 50);
		bookArray[3] = new BookVo("꿈 백화점", "소설", 35);
		bookArray[4] = new BookVo("삼국지", "역사", 10);
	}

	public BookVo[] printBook() {
		return bookArray;
	}
	
	public int getCUT_LINE() {
		return CUT_LINE;
	}

	public int sumRentCount() {
		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum += bookArray[i].getRentCount();
		}
		return sum;
	}

	public double[] avgRentCount() {
		double[] sumAndAvg = new double[2];
		
		sumAndAvg[0] = (double)sumRentCount();
		sumAndAvg[1] = sumAndAvg[0]/5.0;
		
		return sumAndAvg;
	}
	
	public void sortRentCount() {	
		for (int j = 0; j < bookArray.length-1; j++) {
			for (int i = j; i < bookArray.length; i++) {
				if (bookArray[j].getRentCount() < bookArray[i].getRentCount()) {
					BookVo temp = bookArray[j];
					bookArray[j] = bookArray[i];
					bookArray[i] = temp;
				}//end if
			}// end for
		}// end for
	}

	
}
