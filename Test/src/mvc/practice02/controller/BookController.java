package mvc.practice02.controller;

import mvc.practice02.model.Book;

public class BookController {
	private Book[] bArr;
	private final int CUT_LINE;
		
	public BookController() {
		super();
		CUT_LINE = 30;
		this.bArr = new Book[5];
		bArr[0] = new Book("자바의정석", "IT", 45);
		bArr[1] = new Book("혼공 C 언어", "IT", 15);
		bArr[2] = new Book("피프티 피플", "소설", 50);
		bArr[3] = new Book("꿈 백화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}
			
	public int getCUT_LINE() {
		return CUT_LINE;
	}

	public Book[] printBook() {
		return bArr;
	}
	
	public int sumRentCount() {
		int sum = 0;
		for (int i = 0; i < bArr.length; i++) {
			sum += bArr[i].getRentCount();
		}
		return sum;
	}
	
	public double[] avgRentCount() {
		double[] avg = new double[2];
		avg[0] = (double)sumRentCount();
		avg[1] = avg[0]/bArr.length;
		return avg;
	}
	
	public void sortRentCount() {
		Book temp;
		for (int j = 0; j < bArr.length - 1; j++) {
			for (int i = j; i < bArr.length; i++) {
				if (bArr[i].getRentCount() < bArr[j].getRentCount()) {
					temp = bArr[i];
					bArr[i] = bArr[j];
					bArr[j] = temp;
				}
			}
		}
	}
	
}
