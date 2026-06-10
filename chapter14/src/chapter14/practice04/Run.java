package chapter14.practice04;

public class Run {

	public static void main(String[] args) {

		try (A a = new A("홍길동");) {
			a.setName();
			System.out.printf("%s\n", a.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
