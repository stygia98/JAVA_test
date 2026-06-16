package chapter12.practice06.controller;

import chapter12.practice06.model.Book;

public class BookController {
	// 1. Book[] 생성
	private Book[] bArr;
	private final int COUNT = 5;

	public BookController() {
		bArr = new Book[COUNT];
		for (int i = 0; i < bArr.length; i++) {
			bArr[i] = new Book("", "", 0);
		}
	}	

	// 2. 입력
	public void insertBook() {
		bArr[0] = new Book("자바의정석", "IT", 45);
		bArr[1] = new Book("혼공 C 언어", "IT", 15);
		bArr[2] = new Book("피프티 피플", "소설", 50);
		bArr[3] = new Book("꿈 백화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}

	// 3. 출력
	public Book[] selectBook() {
		return bArr;
	}

	// 4. 정렬
	public Book[] sortBook() {
		Book[] copybArr = new Book[COUNT];
		for (int i = 0; i < copybArr.length; i++) {
			copybArr[i] = new Book(bArr[i]);
		}

		for (int i = 0; i < copybArr.length - 1; i++) {
			for (int j = i; j < copybArr.length; j++) {
				if (copybArr[i].getRentCount() < copybArr[j].getRentCount()) {
					Book temp = copybArr[j];
					copybArr[j] = copybArr[i];
					copybArr[i] = temp;
				}
			}
		}
		return copybArr;
	}

	// 5. 수정
	// 6. 삭제
	// 7. 검색
	public Book searchBookTitle(String title) {
		Book findBook = null;
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i].getTitle().contains(title) == true) {
				findBook = bArr[i];
				break;
			}
		}
		return findBook;
	}

	// 8. 요청되는계산
	public int sumRentCount() {
		int sum = 0;
		for (Book book : bArr) {
			sum += book.getRentCount();
		}
		return sum;
	}

	public double[] sumAvg() {
		double[] sumAvgArr = new double[2];
		sumAvgArr[0] = (double) sumRentCount();
		sumAvgArr[1] = sumAvgArr[0] / COUNT;
		return sumAvgArr;
	}

}
