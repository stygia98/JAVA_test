package chapter12.practice03;

public class Run {

	public static void main(String[] args) {
		C c = new C();
		c.cde(new A() {	
			@Override
			public void abc() {
				System.out.println("다형성 구현1");
			}
		});
		
		c.cde(new B());
		
		A a = new A() {
			@Override
			public void abc() {
				System.out.println("다형성 구현3");
			}
		};
		
		c.cde(a);
		
	}

}
