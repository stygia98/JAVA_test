package chapter14.practice05;

public class A {

	public A() {}
	
	public void abc() throws InterruptedException { bcd(); }

	private void bcd() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
			Thread.sleep(500);

//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
		
}
