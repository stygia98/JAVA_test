package com.himedia.class8;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동/수동 형변환
		int ival = (int)34.45f;
//		boolean boolval = Boolean.parseBoolean("true");
//		System.out.printf("boolValue : %b", boolval);
		System.out.println(ival);

		
		double dval = 34.45f;
//		short sval = (short)5 + (short)4;
		int sval = 5 + 4;
		System.out.println(dval);
		System.out.println(sval);

		
		int ival2 = 'a';
		System.out.printf("iVal2 = %d\n(char)iVal2 = %c\n", ival2, (char)ival2);
		
		System.out.println();
		
		// 산술 연산 나눗셈 
		System.out.println( 10 / 4 );
		System.out.println( 10 / 4.0 );
		System.out.println( 10 / (double)4 );
		System.out.println();

		
		// 정수 + 실수
		int ival3 = (int)(10 + 5.4);
		System.out.println(ival3);

	
		// 정수형변수 = short형변수 + byte변수
		short sval2 = 100;
		byte bval2 = 100;
		int ival4 = sval2 + bval2;
		System.out.println(ival4);
		
	}

}
