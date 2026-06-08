package chapter05;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 매개변수 String[] args 출력
		
		if(args != null) {
			for (int i = 0; i < args.length; i++) {
				System.out.printf("args[%d] = %s\n", i, args[i]);
			}
		}
		else System.out.println("args 문자열 없음");

		System.out.println("The end");
	}

}
