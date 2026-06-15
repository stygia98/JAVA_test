package chapter15.test02;

import java.awt.Toolkit;

public class Sound extends Thread {
	@Override
	public void run() {
		Toolkit tk1 = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			tk1.beep();
			System.out.println("Sound");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
