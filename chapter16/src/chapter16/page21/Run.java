package chapter16.page21;

public class Run {

	public static void main(String[] args) {
		MyInterface mi = new MyClass();
		MyClass mi2 = new MyClass();
		
		GenericMethod gm = new GenericMethod();
		gm.<MyInterface>method1(mi);
		gm.<MyClass>method1(mi2);
		
		gm.<MyInterface>method1(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("오버라이딩한 함수2");
			}
		});		
	}

}
