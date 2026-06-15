package chapter16.practice01;

public class Good {
	private Object object;
	
	public Good() {
		this(null);
	}

	public Good(Object object) {
		super();
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}
