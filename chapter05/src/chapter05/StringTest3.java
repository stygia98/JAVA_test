package chapter05;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("안녕하세요");
//		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str1 주소 = %d\n", System.identityHashCode(str1));
		
		String str2 = new String("안녕하세요");
//		System.out.printf("str2 = %s\n", str2);
		System.out.printf("str2 주소 = %d\n", System.identityHashCode(str2));

		System.out.printf("str1 == str2 >>> %b\n", str1 == str2);
		
		
		
		String str3 = "안녕하세요";
//		System.out.printf("str3 = %s\n", str3);
		System.out.printf("str3 주소 = %d\n", System.identityHashCode(str3));

		String str4 = "안녕하세요";
//		System.out.printf("str4 = %s\n", str4);
		System.out.printf("str4 주소 = %d\n", System.identityHashCode(str4));

		System.out.printf("str3 == str4 >>> %b\n", str3 == str4);

		
	}

}
