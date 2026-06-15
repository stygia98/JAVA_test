package chapter16.page26;

public class Run {

	public static void main(String[] args) {
		//부모 제네릭 클래스
		Parent<String> p = new Parent<String>("홍길동");
		p.setT(new String("제우스"));
		System.out.println(p.getT());
		
		Child<String, Integer> c = new Child<>("홍길동", 10);
		c.setT("Java");
		System.out.println(c.getT());
		System.out.println(c.getV());
	}

}
