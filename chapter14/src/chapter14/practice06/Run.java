package chapter14.practice06;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		int no = 110;
				
		try {
			if(no < 0 || no > 100) {
				throw new MyException("0부터 100사이 값 입력");
			} else {
				System.out.println("정상동작");
			}
		} catch (MyException e) {
			e.printStackTrace();
		}

		System.out.println("End");
	}

}
