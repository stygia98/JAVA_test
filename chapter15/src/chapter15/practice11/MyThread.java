package chapter15.practice11;

public class MyThread implements Runnable {

	@Override
	public void run() {
		//일시정지 4초
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println(e.toString());
			for (long i = 0; i < Long.MAX_VALUE; i++) {
				
			}
		}
	}



}
