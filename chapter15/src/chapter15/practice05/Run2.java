package chapter15.practice05;

//import java.awt.Toolkit;

public class Run2 {
	//메인 쓰레드
	public static void main(String[] args) throws InterruptedException {
		Thread mainThread =	Thread.currentThread();
		System.out.printf("메인 쓰레드 이름 : %s\n", mainThread.getName());
		mainThread.setName("Thread-main");
		System.out.printf("메인 쓰레드 이름 : %s\n", mainThread.getName());
		
		System.out.printf("메인 쓰레드 우선순위 : %d\n", mainThread.getPriority());
		
		System.out.printf("메인 쓰레드 코어수 : %d\n",Runtime.getRuntime().availableProcessors());
		
		System.out.println("Main end");
	}

}
