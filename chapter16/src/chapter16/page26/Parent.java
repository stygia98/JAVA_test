package chapter16.page26;

public class Parent<T> {
	private T t;

	public Parent(T t) {
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

class Child<T, V> extends Parent<T>{
	private V v;
	
	public Child(T t, V v) {
		super(t);
		this.v = v;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
}