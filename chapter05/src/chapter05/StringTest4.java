package chapter05;

import java.util.Arrays;

public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello Java");
		System.out.printf("Hello Java\n문자열길이 = %d\n", str1.length());
		
		String str2 = new String("안녕하세요! 반갑습니다.");
		System.out.printf("안녕하세요! 반갑습니다.\n문자열길이 = %d\n", str2.length());
		
		System.out.printf("str1.charAt(0) = %c\n", str1.charAt(0));
		System.out.printf("str2.charAt(0) = %c\n", str2.charAt(0));
		
		System.out.printf("str1.indexOf('a') = %d\n", str1.indexOf('a'));
		System.out.printf("str1.indexOf('a', 8) = %d\n", str1.indexOf('a', 8));

		System.out.printf("str1.indexOf('a') = %d\n", str1.lastIndexOf('a'));
		System.out.printf("str1.indexOf('a', 8) = %d\n", str1.lastIndexOf('a', 8));

		System.out.printf("문자->문자열 %s\n", String.valueOf('a'));
		System.out.printf("문자->문자열 %s\n", String.valueOf(100.24));
		System.out.printf("문자->문자열 %s\n", String.valueOf(false)+1);
		System.out.printf("문자->문자열 %s\n", false+"");

		String str3 = "abc";
		System.out.printf("문자열+문자열 %s\n", str3.concat("def"));
		System.out.printf("문자열+문자열 %s\n", str3 + "def");
		
		String str4 = "Hello";
		String str5 = "안녕하세요";

		byte[] str4ByteArray = str4.getBytes();
		byte[] str5ByteArray = str5.getBytes();

		System.out.printf("%s\n", Arrays.toString(str4ByteArray));
		System.out.printf("%s\n", Arrays.toString(str5ByteArray));
		
//		String str6 ="안녕하세요";
		char[] str5CharArray = str5.toCharArray();
		System.out.printf("%s\n", Arrays.toString(str5CharArray));

		String str6 = "abcd";
		System.out.printf("abcd -> %s\n", str6.toUpperCase());
		
		String str7 = "ABCD";
		System.out.printf("ABCD -> %s\n", str7.toLowerCase());
		
		String str8 = "Java Study";
		System.out.printf("Java Study -> %s\n", str8.replace("Java", "Html"));

		String str9 = "Java Study";
		System.out.printf("Java Study -> %s\n", str9.substring(1,3+1));
		
		String str10 = "abc/def-ght jkl";
		String[] str10Array = str10.split("/|-| ");
		System.out.printf("%s\n", Arrays.toString(str10Array));
		
		String str11 = "   sdf dsf rnk   ";
		System.out.printf("%s\n", str11.trim());
		System.out.printf("%s\n", str11);

		String str12 = "abc";
		String str13 = new String("Abc");
		System.out.printf("%b\n", str12==str13);
		System.out.printf("%b\n", str12.equals(str13));
		System.out.printf("%b\n", str12.equalsIgnoreCase(str13));

		System.out.printf("%s\n", "*".repeat(20));

		
	}

}
