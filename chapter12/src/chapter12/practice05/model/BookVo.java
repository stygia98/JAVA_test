package chapter12.practice05.model;

import java.util.Objects;

public class BookVo {
	private String title;
	private String genre;
	private int rentCount;
	
	public BookVo() {
		this(null, null, 0);
	}

	public BookVo(String title, String genre, int rentCount) {
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
		return Objects.hash(genre, title);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof BookVo)) {
			return false;
		}
		BookVo bV = (BookVo)obj;
		if(this.title.equals(bV.title) && this.genre.equals(bV.genre))
			return true;
		return false;
	}

	public String inform() {
		return "[도서명:" + title + " / 장르:" + genre + " / 대여 횟수:" + rentCount + "]";
	}
	
}
