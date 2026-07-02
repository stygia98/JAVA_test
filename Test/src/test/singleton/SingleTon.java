package test.singleton;

// 싱글톤 (3가지 -> 멤버변수, 생성자, 맴버함수)
public class SingleTon {
	private static SingleTon instance;

	private SingleTon() { super(); }

	public static SingleTon getInstance() {
		if(instance == null) instance = new SingleTon();
		return instance;
	}
	
	public int sum(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i++) sum += i;
		return sum;
	}
}
