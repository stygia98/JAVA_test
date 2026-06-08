package com.himedia.class8;

public class Value1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fval = 1.0000001111f;
		System.out.printf("fval = %f\n", fval);
		
		double dval = 1.00000000000000011111;
//		System.out.printf("dval = %17.1f\n", dval);
		System.out.println(dval);
		
		boolean bval = 10 > 2;
		System.out.printf("bval = %b\n", bval);
		System.out.println();

		char cval = '!';
		System.out.printf("cval = %04x\n", (int)cval);
		System.out.printf("cval = 0x%04d\n", (int)cval);
		System.out.println();

		cval = 35;
		System.out.printf("cval = %c\n", cval);
		System.out.printf("cval = %c\n", (int)cval);
		System.out.println();

		cval = '\u0042';
		System.out.printf("cval = %c\n", cval);
		System.out.printf("cval = 0x%04d\n", (int)cval);
		System.out.println();


	}

}
