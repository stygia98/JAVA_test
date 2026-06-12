package chapter15.practice02;

//import java.awt.Toolkit;

public class Run2 {
	//메인 쓰레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지 일을 진행하려고 한다
		// 소리 출력 - beep 
		// 글자 출력 - print 1조마다 1~5까지
		// 사운드 클래스 tool kit
		
		//Thread 상속
		PrintNumber2 pn2 = new PrintNumber2();
		Thread thread1 = new Thread(pn2);

		ToolkitThread2 tk2 = new ToolkitThread2();
		Thread thread2 = new Thread(tk2);

		thread1.start();
		thread2.start();
		
		
		
		System.out.println("Main end");
	}

}
