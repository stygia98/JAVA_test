package chapter15.practice13;

public class DataBox {
	private String breadState;

	public DataBox(String breadState) {
		super();
		this.breadState = null;
	}

	public synchronized void getBreadState() { 
		
		if(this.breadState == null) {
			try { wait(); } catch (InterruptedException e) { }
		}
		
		System.out.printf("%s : 바구니에서 꺼내갑니다\n", this.breadState);
		this.breadState = null;
		notify(); // wait() 해제
	}
	
	public synchronized void setBreadState(String breadState) { 
		
		if(this.breadState != null) {
			try { wait(); } catch (InterruptedException e) { }
		}
		
		this.breadState = breadState; 
		System.out.printf("%s : 바구니에 넣었습니다\n", this.breadState);
		notify(); // wait() 해제
	}
	
		
}
