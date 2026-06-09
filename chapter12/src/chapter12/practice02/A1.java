package chapter12.practice02;

public class A1 {
	
	public C c = new C() {
		@Override
		public void bcd() {
			System.out.println("다형성 구현2");
		}
	};
	
//	public C c = new B();
//	public class B implements C{
//		@Override
//		public void bcd() {
//			System.out.println("다형성 구현2");
//		}	
//	}
	
	public void abc() {
		c.bcd();
	}
	
}
