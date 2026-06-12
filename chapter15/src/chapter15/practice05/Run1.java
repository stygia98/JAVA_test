package chapter15.practice05;

//import java.awt.Toolkit;

public class Run1 {
	//메인 쓰레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지 일을 진행하려고 한다
		// 소리 출력 - beep 
		// 글자 출력 - print 1조마다 1~5까지
		// 사운드 클래스 tool kit
		
		//Thread 상속
		PrintNumber pn2 = new PrintNumber();
		Thread thread1 = new Thread(pn2);
		thread1.setName("Thread-print");
		
		ToolkitThread tk2 = new ToolkitThread();
		Thread thread2 = new Thread(tk2);
		thread2.setName("Thread-sound");

		thread1.start();
		thread2.start();
		
		System.out.printf("작동중 쓰레드 수 : %d\n", Thread.activeCount());
		System.out.printf("thread1 쓰레드 이름 : %s\n", thread1.getName());
		System.out.printf("thread2 쓰레드 이름 : %s\n", thread2.getName());
		System.out.printf("thread1 우선순위 : %d\n", thread1.getPriority());
		System.out.printf("thread2 우선순위 : %d\n", thread2.getPriority());


		
		System.out.println("Main end");
	}

}
