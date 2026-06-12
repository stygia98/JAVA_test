package chapter15.practice12;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < Long.MAX_VALUE; i++) {	}
	}
}
