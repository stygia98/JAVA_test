package chapter15.practice08;

public class MyData {
	public synchronized void abc(String threadName) {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s %d 秒\n",threadName, i+1);
			try {Thread.sleep(500);}
			catch (InterruptedException e) {}
		}
	}
	
	public synchronized void def(String threadName) {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%s %d 초\n",threadName, i+1);
			try {Thread.sleep(500);}
			catch (InterruptedException e) {}
		}
	}
	
	public void ghi(String threadName) {
		synchronized (this) {
//		synchronized (new Object()) {
			for (int i = 0; i < 5; i++) {
				System.out.printf("%s %d sec\n",threadName, i+1);
				try {Thread.sleep(500);}
				catch (InterruptedException e) {}
			}
		}
	}
	
	
}
