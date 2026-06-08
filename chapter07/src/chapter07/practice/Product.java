package chapter07.practice;

public class Product {
	String productName;
	int price;
	String brand;

	public Product() {
		
	}

	public Product(String productName, int price, String brand) {
		this.productName = productName;
		this.price = price;
		this.brand = brand;
	}
	
	public String getProductName() {return productName;}
	public void setProductName(String productName) {this.productName = productName;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public String getBrand() {return brand;}
	public void setBrand(String brand) {this.brand = brand;}

	public void information() {
		System.out.printf("%-10s / %-10d / %-10s\n", productName, price, brand);
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
		
}
