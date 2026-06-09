package chapter12.practice05.controller;

import chapter12.practice05.model.BookVo;

public class BookController extends BookVo {
	private BookVo[] bookArray;
	final int CUT_LINE = 0;
		
	public BookController() {
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

	public int sumRentCount() {
		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum += getRentCount();
		}
		return sum;
	}
	
	public double[] avgRentCount() {
		double[] sumAndAvg = new double[2];
		
		sumAndAvg[0] = (double)sumRentCount();
		sumAndAvg[1] = sumAndAvg[0]/5.0;
		
		return sumAndAvg;
	}
	
	
	
	
	
	

}
