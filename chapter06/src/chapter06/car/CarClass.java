package chapter06.car;

public class CarClass {
	String color;
	int price;
	int productYear;
	String name;
	
	public CarClass(String color, int price, int productYear, String name) {
		this.color = color;
		this.price = price;
		this.productYear = productYear;
		this.name = name;
	}
	
	
	
	
	public void setColor(String color) {
		if(color == null || color.equals("")) {
			System.out.println("잘못된 값 입력");
			return;
		}
		
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void drive( ) {
		System.out.printf("%s 색상인 %s 차를 타고 운전 \n", this.color, this.name);
	}
	
	public void carPrint() {
		System.out.printf("색상 : %-5s / 가격 : %-7d / 생산년도 : %-7d / 이름 : %s \n", color, price, productYear, name);
			
	}

	@Override
	public String toString() {
		return "CarClass [" + color + ", " + price + ", " + productYear + ", " + name + "]";
	}
	
	
}
