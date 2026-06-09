package chapter12.practice05.model;

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
	
	public String inform() {
		return "StudentVo [title=" + title + ", genre=" + genre + ", rentCount=" + rentCount + "]";
	}
	
}
