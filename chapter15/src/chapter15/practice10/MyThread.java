package chapter15.practice10;

public class MyThread extends Thread {
	public boolean exitFlag = false;
	public boolean yieldFlag = false;
	
	@Override
	public void run() {
		while(!exitFlag) {
			if (yieldFlag) {
				Thread.yield();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.printf("%s - 실행중\n", this.getName());
				for (long i = 0; i < 1_000_000_000L; i++) {
				}
			}
		}//end while
	}//end run()
}
