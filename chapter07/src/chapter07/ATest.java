package chapter07;

public class ATest {

	public static void main(String[] args) {
		A a = new A(3, 4);
		
//		a.m = 10;
		a.setM(10);
		
//		System.out.printf("A.a = %d\n", a.m);
//		System.out.printf("A.a = %d\n", a.n);
		System.out.printf("A.a = %d\n", a.getM());
		System.out.printf("A.a = %d\n", a.getN());
		
		a.work1();
		
		//TempClass temp1 = new TempClass(3, 4, 5);
		
		System.out.println();
		
	}

}
