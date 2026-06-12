package chapter15.practice12;

public class MyThread2 extends Thread {
	public MyThread1 mt1;
	
	public MyThread2(MyThread1 mt1) {
		super();
		this.mt1 = mt1;
	}
	
	
	@Override
	public void run() {
		try {
			mt1.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (long i = 0; i < Long.MAX_VALUE; i++) {	}
	}
}
