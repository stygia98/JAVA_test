package chapter16.page19;

public class A {}
class B extends A{}
class C extends B{}
//Object-> A -> B -> C -> D
//제네릭타입에 타입제한 (Object까지 -> B까지) 사용가능
class D<T extends B> {
	T t;

	public D(T t) {
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