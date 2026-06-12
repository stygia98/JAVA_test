package chapter15.practice07;

public class MyData {
	private int data;

	public MyData() {
		this(0);
	}

	public MyData(int data) {
		super();
		this.data = data;
	}

	public int getData() {return data;}
	public void setData(int data) {this.data = data;}

	public void plusData() {
		synchronized (this) {
			int bufferData = this.data;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.data = bufferData + 1;
		}
	}
}
