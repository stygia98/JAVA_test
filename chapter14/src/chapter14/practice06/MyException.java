package chapter14.practice06;

@SuppressWarnings("serial")
public class MyException extends Exception {
	@SuppressWarnings("unused")
	private String message;

	public MyException() {
		this(null);
	}

	public MyException(String message ) {
		super(message);
		this.message = message;
	}
	
		
}
