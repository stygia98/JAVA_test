package chapter12.practice02;

public class Run {

	public static void main(String[] args) {
		//자식 객체
		B b = new B();
		b.bcd();
		
		//부모 객체
		C c = new B();
		c.bcd();
		
		// interface 객체 생성불가
		//C c = new C();
		
		//익명클래스 -> 익명객체 -> 부모 = 익명객체 
		C c2 = new C() {
			@Override
			public void bcd() {
				System.out.println("부모로 부터 구현된 다형성");
				cde();
			}
			public void cde() {
				System.out.println("익명에서 사용하는 함수");
			}
		};
		c2.bcd();
//		c2.cde(); //에러
		
		
		A1 a1 = new A1();
		a1.abc();
		
	}//end main
}//end class Run
