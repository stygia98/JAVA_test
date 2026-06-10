package chapter14.practice01;

public class Run3 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.charAt(2));
		} catch (Exception e) {
			System.out.println("잘못된 값 입력");
		} finally {
			System.out.println("무조건 실행 된 명령");
		}
		
		System.out.println("end");
		
	}

}
