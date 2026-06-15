package chapter15.test01;

import java.awt.Toolkit;

public class Run {

	public static void main(String[] args) {
//============================================================1 // 외부클래스 extends Thread
//		BeepThread t1 = new BeepThread(); 
//		DisplayThread t2 = new DisplayThread();
//		
//		t1.start();
//		t2.start();
//============================================================2
//		Thread t1 = new Thread() {
//			public void run() {
//				Toolkit tk = Toolkit.getDefaultToolkit();
//				
//				for (int i = 0; i < 5; i++) {
//					tk.beep();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//				System.out.println("Sound End");
//			};
//		};
//		
//		Thread t2 = new Thread() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println(i+1);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//				System.out.println("Print End");
//			}
//		};
//	
//		t1.start();
//		t2.start();
//============================================================3 // 외부클래스 implements Runnable	
//		BeepThread2 th1 = new BeepThread2();
//		DisplayThread2 th2 = new DisplayThread2();
//		Thread t1 = new Thread((Runnable)th1);
//		Thread t2 = new Thread((Runnable)th2);
//		
//		t1.start();
//		t2.start();
//============================================================4
//		Runnable th1 = new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("띵");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//					}
//				}				
//			}
//		};
//		
//		Runnable th2 = new Runnable() {
//			@Override
//			public void run() {
//				Toolkit tk1 = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					tk1.beep();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//					}
//				}
//			}
//		};
//		
//		Thread t1 = new Thread(th1);
//		Thread t2 = new Thread(th2);
//		
//		t1.start();
//		t2.start();
//============================================================5
//		Runnable th1 = () -> {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("띵");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//					}
//				}
//		};
//		
//		Runnable th2 = () -> {
//				Toolkit tk1 = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					tk1.beep();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//					}
//				}
//		};
//		
//		Thread t1 = new Thread(th1);
//		Thread t2 = new Thread(th2);
//		
//		t1.start();
//		t2.start();
//============================================================6
		Thread t1 = new Thread( () -> {
				for (int i = 0; i < 5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		} );
		
		Thread t2 = new Thread( () -> {
			Toolkit tk1 = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tk1.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		} );
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread END");
		
	}

}
