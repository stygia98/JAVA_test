package chapter12.practice01;

public class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	static int sa = 10;
	// 멤버변수 인스턴스 맴버 클래스 = 인스턴스 멤버 변수
	
	// 내부 클래스 B==============================
	class B {
		public int a = 13;
		protected int b = 14;
		
		void bcd() {
			System.out.println(A.this.a); // 안쪽 변수 호출
			System.out.println(A.this.b); // 안쪽 변수 호출
			System.out.println(a); // 바깥쪽 변수 호출
			System.out.println(b); 
			System.out.println(c);
			System.out.println(d);
			outterFunc(); // 바깥쪽 함수 호출
		}
	}
	
	// 내부 클래스 static C========================
	static class C {
		void bcd() {
			//System.out.println(a); 에러
			//System.out.println(b); 에러
			//System.out.println(c); 에러
			//System.out.println(d); 에러
			System.out.println(sa); // static 변수만 호출가능
			//outterFunc(); // static 함수만 호출가능
		}
	}
	
	// 밖 함수 =================================
	public void outterFunc() {
		System.out.println("바깥쪽 함수");
		int lb = 5;
		
		class Local {
			public void localBcd() {
				System.out.println("지역클래스 " + a);
				System.out.println("지역클래스 " + lb);
			}
			
		}
		
		Local local = new Local();
		local.localBcd();
//		lb = 10;
	}
	
}
