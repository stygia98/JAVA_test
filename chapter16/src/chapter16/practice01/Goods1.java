package chapter16.practice01;

public class Goods1 {
	private Apple apple;
	
	public Goods1() {
		this(null);
	}

	public Goods1(Apple apple) {
		super();
		this.apple = apple;
	}

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}
