package chapter16.page12;

public class GenericMethod {
	//리턴: o, 매개변수: o
	public <T> T method1(T t) {
		return t;
	}
	//리턴: x, 매개변수: o(타입2)
	public <T, S>Object method2(T t, S s) {
		System.out.print(t.toString() + "\t");
		System.out.println(s.toString());
		return null;
	}
}
