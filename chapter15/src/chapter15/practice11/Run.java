package chapter15.practice11;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		t1.start();
		
		Thread.sleep(100);
		System.out.printf("My Thread 상태: %s\n", t1.getState());
		
		t1.interrupt();
		Thread.sleep(100);
		System.out.printf("My Thread 상태: %s\n", t1.getState());

	}

}
