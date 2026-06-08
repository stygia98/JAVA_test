package chapter07.valuelength;

public class ArrayParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] a = (new int[]{1,2}) => (int[] a)
		
		method1(new int[] {1,2});
//		method1({2,4});
		
		int[] a = new int[] {11,22};
		method1(a);
		
		method2(22,33);
		method2(a);
//		method2({2,4});
		method2(new int[] {44,45});
		
		method3("aaa", "bbb");
		method3(new String[] {"aaa1", "bbb1"});
		String[] strArray = {"aaa2", "bbb2"};
		method3(strArray);
	}
	
	public static void method1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("(1번)%-5d", a[i]);
		}
		System.out.println();
	}
	
	public static void method2(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("(2번)%-5d", a[i]);
		}
		System.out.println();
	}
	
	public static void method3(String... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("(3번)%-10s", a[i]);
		}
		System.out.println();
	}

}
