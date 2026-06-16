package chapter12.practice06.model;

import java.util.Objects;

public class Book {
	private String title;
	private String genre;
	private int rentCount;
		
	public Book() {
		this(null, null, 0);
	}

	public Book(String title, String genre, int rentCount) {
		super();
		this.title = title;
		this.genre = genre;
		this.rentCount = rentCount;
	}
	
	public Book(Book book) {
		this.title = book.title;
		this.genre = book.genre;
		this.rentCount = book.rentCount;
	}

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getGenre() {return genre;}
	public void setGenre(String genre) {this.genre = genre;}
	public int getRentCount() {return rentCount;}
	public void setRentCount(int rentCount) {this.rentCount = rentCount;}

	@Override
	public int hashCode() {
		return Objects.hash(genre, title);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equalsFlag = false;
		if(obj instanceof Book)
			equalsFlag = true;
		if(((Book)obj).getTitle().equals(this.getTitle()) && ((Book)obj).getGenre().equals(this.getGenre()))
			equalsFlag = true;
		return equalsFlag;
	}

	@Override
	public String toString() {
		return "[도서명: " + title + "/ 장르: " + genre + "/ 대여횟수: " + rentCount + "]";
	}
	
}
