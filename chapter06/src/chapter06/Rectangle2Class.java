package chapter06;

public class Rectangle2Class {
	double width;
	double height;
	double areaRectangle;
	
	public Rectangle2Class(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
//	double calcArea() {
//		return areaRectangle = width * height;
//	}
	
	void calcArea() {
		areaRectangle = width * height;
	}
	
	void printArea() {
		System.out.printf("폭 : %-5.2f / 높이 : %-5.2f / 면적 : %-5.2f\n", width, height, areaRectangle);
	}
}
