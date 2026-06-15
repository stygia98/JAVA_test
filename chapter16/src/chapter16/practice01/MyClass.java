package chapter16.practice01;

public class MyClass<T> {
	private T t;
	
	public MyClass() {
		this(null);
	}

	public MyClass(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
