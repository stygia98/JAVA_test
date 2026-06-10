package chapter14.practice02;

public class Run {

	public static void main(String[] args) {
		//다중 예외 처리
		try {
			@SuppressWarnings("unused")
			int a = Integer.parseInt("20A");
			System.out.println(3/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		} catch (NumberFormatException e) {
//			System.out.println("NumberFormatException");
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			System.out.println("end");
		}
		
	}

}
