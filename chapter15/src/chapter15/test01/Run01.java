package chapter15.test01;

import java.awt.Toolkit;

public class Run01 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				
				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
//						e.printStackTrace();
					}
				}
				System.out.println("Sound End");
			};
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i+1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
//						e.printStackTrace();
					}
				}
				System.out.println("Print End");
			}
		};
	
		t1.start();
		t2.start();
	
	}

}
