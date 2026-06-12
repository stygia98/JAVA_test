package chapter15.practice06;

public class Run {

	public static void main(String[] args) {
//		MyThread thread = new MyThread();
//		thread.start();
		
		Thread[] tArr = new Thread[10];
		
		for (int i = 0; i < 10; i++) {
			tArr[i] = new MyThread();
			tArr[i].setName("쓰레드"+ (i+1));
			tArr[i].start();
			
			if(i == 9) tArr[i].setPriority(Thread.MAX_PRIORITY);
			else tArr[i].setPriority(Thread.NORM_PRIORITY);
		}
		
	}

}
