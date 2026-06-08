package chapter07;

public class A {
	int m;
	int n;
	
	public A(int m, int n) {
		super();
		this.m = m;
		this.n = n;
	}
	
	public int getM() {
		return this.m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void work1( ) {
		int k = 5;
		System.out.printf("k = %d\n", k);
		work2(3);
	}

	public void work2(int i) {
		int j = 4;
		System.out.printf("%d + %d = %d \n",i ,j ,i+j);
	}
	
	public void work3() {
		int k = 10;
		System.out.printf("지역변수 k = %d\n", k);
	}

	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + "]";
	}
	
}
