package mvc.practice03.controller;

import mvc.practice03.model.Book;

public class BookController {
	private Book[] bArr;
	private Book[] copyBArr;
	private final int COUNT;
	
	public BookController() {
		super();
		COUNT = 5;
		bArr = new Book[COUNT];
		copyBArr = new Book[COUNT];
	}
			
	public int getCOUNT() {
		return COUNT;
	}
	
	public Book[] getbArr() {
		return bArr;
	}

	public void setbArr(Book[] bArr) {
		this.bArr = bArr;
	}

	public Book[] getCopyBArr() {
		return copyBArr;
	}

	public void setCopyBArr(Book[] copyBArr) {
		this.copyBArr = copyBArr;
	}

	public boolean setBookList() {
		boolean checkNull = false;
		
		bArr[0] = new Book("자바의정석", "IT", 15);
		bArr[1] = new Book("혼공 C 언어", "IT", 15);
		bArr[2] = new Book("피프티 피플", "소설", 50);
		bArr[3] = new Book("꿈 백화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 35);
		
		for (int i = 0; i < bArr.length; i++) {
			if(bArr[i] == null);
			checkNull = true;
		}
		return checkNull;
	}
	
//	public void getBookList(Book[] bArr) {
//		for (Book book : bArr) {
//			System.out.printf("%s\n", book.toString());
//		}
//	}
	
	public Book[] sortBookList() {

		for (int i = 0; i < bArr.length; i++) {
			copyBArr[i] = new Book(bArr[i]);
		}
		
		for (int j = 0; j < bArr.length-1; j++) {
			for (int i = j; i < bArr.length; i++) {
				if(copyBArr[j].getRentCount() < copyBArr[i].getRentCount()) {
					Book temp = copyBArr[j];
					copyBArr[j] = copyBArr[i];
					copyBArr[i] = temp;
				}
			}
		}
		return copyBArr;
	}
	
	public int sumRentCount() {
		int sum = 0;
		for (int i = 0; i < bArr.length; i++) {
			sum += bArr[i].getRentCount();
		}
		return sum;
	}
	
	public double avgRentCount() {
		double avg = 0;
		avg = (double)this.sumRentCount() / this.COUNT;
		return avg;
	}
	
	public Book searchBookTitle(String str) {
		Book tempBook = null;
		for (int i = 0; i < bArr.length; i++) {
//			if(str.equals(bArr[i].getTitle())) {
			if(bArr[i].getTitle().contains(str)) {
				tempBook = bArr[i];
				break;
			}
		}
		return tempBook;
	}
	
	public String[] rankBookTitle() {
		String[] temp = new String[COUNT];
		int RankCOUNT = 1;
					
		for (int i = 0; i < bArr.length; i++) {
			if(i==0) {
				temp[i] = copyBArr[i].toString() + "[Rank:"+ RankCOUNT + "]";
			}
			if(i!=0 && copyBArr[i].getRentCount() == copyBArr[i-1].getRentCount()) {
				temp[i] = copyBArr[i].toString() + "[Rank:"+ --RankCOUNT + "]";
			}
			if(i!=0 && copyBArr[i].getRentCount() != copyBArr[i-1].getRentCount()) {
				temp[i] = copyBArr[i].toString() + "[Rank:"+ RankCOUNT + "]";
			}
			RankCOUNT++;
		}
		return temp;
	}
	
}
