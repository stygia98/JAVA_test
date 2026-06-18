package chapter16.page20;

public class GenericMethod {
	//제네릭 메소드 타입제한
	//리턴값: o, 매개변수: o
	public <T extends CharSequence> T method1(T t) {
		int len = t.length();
		System.out.printf("length = %d\n", len);
		return null;
	}
}
