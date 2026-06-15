package chapter15.test02;

public class Display2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Display");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
