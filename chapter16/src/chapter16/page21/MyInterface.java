package chapter16.page21;

public interface MyInterface {
	public abstract void print();
	
}

class GenericMethod {
	public <T extends MyInterface >T method1(T t) {
		t.print();
		return null;
	}
	
}