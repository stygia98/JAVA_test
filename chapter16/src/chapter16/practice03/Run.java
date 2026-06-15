package chapter16.practice03;

public class Run {

	public static void main(String[] args) {
		//제너릭 메서드 활용 출력
		GenericMethod gm = new GenericMethod();
		String s1 = gm.<String>method1("홍길동");
		Integer i1 = gm.<Integer>method1(10);
		Double d1 = gm.<Double>method1(23.4);

		System.out.printf("String : %s\n", s1);
		System.out.printf("Integer : %d\n", i1);
		System.out.printf("Double : %f\n", d1);

		gm.<String, Integer>method2("홍길동", 60);
		
	}

}
