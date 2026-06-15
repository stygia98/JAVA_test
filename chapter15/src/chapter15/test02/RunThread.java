package chapter15.test02;

import java.awt.Toolkit;

public class RunThread {

	public static void main(String[] args) {
		
//=================================================================================================== [1]
//		Display th1 = new Display();
//		Sound th2 = new Sound();
//=================================================================================================== [2]
//		Thread t1 = new Thread() {
//			@Override
//			public void run() {
//				display();
//			} 
//		};
//		
//		Thread t2 = new Thread() {
//			@Override
//			public void run() {
//				sound();
//			} 
//		};
//=================================================================================================== [3]
//		Display th1 = new Display();
//		Sound th2 = new Sound();		
//		Thread t1 = new Thread(th1);
//		Thread t2 = new Thread(th2);
//=================================================================================================== [4]
//		Runnable th1 = new Runnable() {
//			@Override
//			public void run() {
//				display();
//			}
//		};
//		
//		Runnable th2 = new Runnable() { 
//			@Override
//			public void run() {
//				sound();
//			}
//		};
//		
//		Thread t1 = new Thread(th1);
//		Thread t2 = new Thread(th2);
//		
//		t1.start();
//		t2.start();
//=================================================================================================== [5]		
//		Thread t1 = new Thread( () -> { display(); } );
//		Thread t2 = new Thread( () -> {	sound(); } );
//		
//		t1.start();
//		t2.start();

		new Thread( () -> { display(); } ).start();
		new Thread( () -> { sound(); } ).start();
		
		System.out.println("Main Thread End");

	}

	
	
	
	
	
	
	
	
	
	
	private static void sound() {
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

	private static void display() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Display");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}		
	}
	
	

}
