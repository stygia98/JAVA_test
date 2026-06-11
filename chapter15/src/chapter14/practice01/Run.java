package chapter14.practice01;

//import java.awt.Toolkit;

public class Run {
	//메인 쓰레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지 일을 진행하려고 한다
		// 소리 출력 - beep 
		// 글자 출력 - print 1조마다 1~5까지
		// 사운드 클래스 tool kit

//		Toolkit tk = Toolkit.getDefaultToolkit();
//		for (int i = 0; i < 5; i++) {
//			tk.beep();
//			Thread.sleep(1000);
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i+1);
//			Thread.sleep(1000);
//		}

		
		//Thread 상속
		ToolkitThread tkt = new ToolkitThread();
		//tkt.setDaemon(true);
		PrintNumber pn = new PrintNumber();
		pn.setDaemon(true);
		
		tkt.start();
		pn.start();
		
		Thread.sleep(2000);

		System.out.println("Main end");
	}

}
