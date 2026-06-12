package chapter15.practice07;

public class PlusThread extends Thread {
	private MyData myData;
	
	public PlusThread() {
		this(null);
	}
	
	public PlusThread(MyData myData) {
		super();
		this.myData = myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.printf("%s - data값 : %d\n", this.getName(), myData.getData());
	}

}
