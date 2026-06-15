package chapter16.page28;

public class Run {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.<String>method1("홍길동");

		Child c = new Child();
		c.<Number>method1(10);
		
	}

}
