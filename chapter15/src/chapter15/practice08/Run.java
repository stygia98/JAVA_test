package chapter15.practice08;

public class Run {

	public static void main(String[] args) {
		MyData myData = new MyData();
		
		Thread t1 = new Thread ( new Runnable() {
			@Override
			public void run() {
				myData.abc("스레드1");
			}
		} );
		
		Thread t2 = new Thread ( new Runnable() {
			@Override
			public void run() {
				myData.def("스레드2");
			}
		} );
		
		Thread t3 = new Thread ( new Runnable() {
			@Override
			public void run() {
				myData.ghi("스레드3");
			}
		} );
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
