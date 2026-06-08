package chapter07.overloading;

public class Atest {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		a.print(10);
		a.print(10.1);
		a.print(10, 10.5);
		a.print(10.3, 10);
		a.print("kdj", 10);
	}
}
