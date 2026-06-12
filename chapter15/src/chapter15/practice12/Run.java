package chapter15.practice12;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//2개의 스레드 생성 후 상태값 확인
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		
		MyThread2 mt2 = new MyThread2(mt1);
		mt2.start();
		

		System.out.printf("My Thread1 : %s\n", mt1.getState());
		System.out.printf("My Thread2 : %s\n", mt2.getState());
		
		
		Thread.sleep(100);
		
		mt2.interrupt();
		Thread.sleep(100);
		
		System.out.printf("My Thread1 : %s\n", mt1.getState());
		System.out.printf("My Thread2 : %s\n", mt2.getState());

	}

}
