package chapter15.practice07;

public class Run {

	public static void main(String[] args) {
		MyData myData = new MyData(3);
		
		PlusThread pt1 = new PlusThread(myData);
		pt1.setName("스레드1");
		pt1.start();
		
		PlusThread pt2 = new PlusThread(myData);
		pt2.setName("스레드2");
		pt2.start();
	}

}
