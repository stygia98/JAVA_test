package chapter07.practice;

public class Book {
	String title;
	String author;
	String publisher;
	int price;
	double discountRate;
		
	public Book() {
		super();
	}

	public Book(String title, String author, String publisher, int price, double discountRate) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}
	public String getPublisher() {return publisher;}
	public void setPublisher(String publisher) {this.publisher = publisher;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public double getDiscountRate() {return discountRate;}
	public void setDiscountRate(double discountRate) {this.discountRate = discountRate;}

	public void inform() {
		System.out.printf("도서명 : %-10s / 저자명 : %-10s / 출판사 : %-5s / 가격 : %-5d / 할인율 : %-5.2f\n", 
				title, author, publisher, price, discountRate);
	}

}
