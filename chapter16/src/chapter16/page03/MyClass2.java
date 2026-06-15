package chapter16.page03;

public class MyClass2<T, S> {
	private T t;
	private S s;
	
	public MyClass2() {
		this(null, null);
	}

	public MyClass2(T t, S s) {
		super();
		this.t = t;
		this.s = s;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public S getS() {
		return s;
	}

	public void setS(S s) {
		this.s = s;
	}
	
}
