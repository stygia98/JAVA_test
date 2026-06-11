package chapter14.practice06;

@SuppressWarnings("serial")
public class MyRTException extends RuntimeException {
	@SuppressWarnings("unused")
	private String message;

	public MyRTException() {
		this(null);
	}

	public MyRTException(String message ) {
		super(message);
		this.message = message;
	}
	
		
}
