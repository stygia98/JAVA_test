package chapter15.practice06;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (long i = 0L; i < 100_000_000_000_000_000L; i++) {
			
		}
		System.out.printf("스레드: %s / 우선순위: %d / 작업종료\n", this.getName(), this.getPriority());
		
	}

}
