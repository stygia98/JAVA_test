package chapter15.practice01;

import java.awt.Toolkit;

public class ToolkitThread extends Thread {
	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
			}
		}
		System.out.println("Sound End");
	}
}
