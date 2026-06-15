package chapter16.page28;

public class Parent {
	public <T> String method1(T t) {
		System.out.println(t.toString());
		return null;
	}
}

class Child extends Parent {}
