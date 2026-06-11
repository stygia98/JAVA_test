package mvc.practice01.model;

import java.util.Objects;

public class Book implements AutoCloseable {
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

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getGenre() {return genre;}
	public void setGenre(String genre) {this.genre = genre;}
	public int getRentCount() {return rentCount;}
	public void setRentCount(int rentCount) {this.rentCount = rentCount;}

	@Override
	public int hashCode() {
		return Objects.hash(this.genre, this.title);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book)) return false;
		
		Book bk = (Book)obj;
		if(this.title.equals(bk.title) && this.genre.equals(bk.genre)) return true;
		
		return false;
	}

	@Override
	public String toString() {
		return "[도서명/" + title + ", 장르/" + genre + ", 대여횟수/" + rentCount + "]";
	}
	
	@Override
	public void close() throws Exception{
	}
	
}
