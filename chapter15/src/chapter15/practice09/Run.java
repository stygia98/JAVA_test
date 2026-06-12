package chapter15.practice09;

import chapter15.practice10.MyThread;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.setName("스레드 1");
		t1.setDaemon(true);
		t1.yieldFlag = false;
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("스레드 2");
		t2.setDaemon(true);
		t2.yieldFlag = true;
		t2.start();
		
		for (int i = 0; i < 18; i++) {
			Thread.sleep(1000);
			t1.yieldFlag = !t1.yieldFlag;
			t2.yieldFlag = !t2.yieldFlag;
		}
		
		System.out.println("Main Thread End");
		
	}

}
