package chapter15.practice13;

public class Run {

	public static void main(String[] args) {
		DataBox db1 = new DataBox(null);
		
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					db1.setBreadState((i+1) +"번째 빵");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					db1.getBreadState();
				}
			}
		};
		
		t1.start();
		t2.start();
		
		
	}

}
