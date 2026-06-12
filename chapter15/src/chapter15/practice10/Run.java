package chapter15.practice10;

public class Run {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.printf("Main Thread state : %s\n", mainThread.getState());
		
		Thread thread1 = new Thread ( new Runnable() {
			
			@Override
			public void run() {
				for (long i = 0; i < 100_000_000_000L; i++) {
					
				}
			}
		} );
		
		System.out.printf("Thread state : %s\n", thread1.getState());
		
		thread1.start();
		
		System.out.printf("Thread state : %s\n", thread1.getState());
		
		try {
			thread1.join();
		} catch (InterruptedException e) {}
		System.out.printf("Thread state : %s\n", thread1.getState());
		
		System.out.println("Main Thread end");
		System.out.printf("Main Thread state : %s\n", mainThread.getState());
		
	}

}
