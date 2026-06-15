package chapter16.practice02;

public class Run {
	public static void main(String[] args) {
		
		//제너릭 클래스 사용해서 문자열 객체 저장 출력
		//=================================================================
		MyClass<String> mc = new MyClass<String>("제우스");
		System.out.printf("%s\n", mc.getT());
		
//		MyClass<Integer> mc2 = new MyClass<Integer>( new Integer(10) );
		MyClass<Integer> mc2 = new MyClass<Integer>(10);
		System.out.printf("%d\n", mc2.getT());
		mc2.setT(20);
		System.out.printf("%d\n", mc2.getT());
		

	}
	
}
