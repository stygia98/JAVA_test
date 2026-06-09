package chapter12.practice01;

public class Run {
	public static void main(String[] args) {
		// 클래스 A의 객체 생성
		A a_obj = new A();
		System.out.println(a_obj.a);
		
		// 내부클래스 B의 객체 생성
		A.B b_obj = a_obj.new B();
		b_obj.bcd();
		
		// 내부클래스 static C의 객체 생성
		//A.C c_obj = a_obj.new C(); // 에러
		A.C c_obj = new A.C();
		c_obj.bcd();
		
		
	}
		
}
