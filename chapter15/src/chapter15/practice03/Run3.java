package chapter15.practice03;

import java.awt.Toolkit;

//import java.awt.Toolkit;

public class Run3 {
	//메인 쓰레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지 일을 진행하려고 한다
		// 소리 출력 - beep 
		// 글자 출력 - print 1조마다 1~5까지
		// 사운드 클래스 tool kit
		
		//Thread 상속
		Thread thread1 = new Thread( new Runnable() {
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
		} );

		Thread thread2 = new Thread( new Runnable() {
			@Override
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
			}
		});

		thread1.start();
		thread2.start();
				
		System.out.println("Main end");
	}

}
