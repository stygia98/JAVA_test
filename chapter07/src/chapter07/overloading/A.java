package chapter07.overloading;

public class A {

	public void print() {
		System.out.printf("오버로딩함수\n");
	}
	
	public int print(int no) {
		System.out.printf("오버로딩함수 no = %d\n", no);
		return no;
	}
	
	public int print(double no) {
		System.out.printf("오버로딩함수 no = %5.2f\n", no);
		return (int)no;
	}
	
	public void print(int no, double dno) {
		System.out.printf("오버로딩함수 no = %d dno = 5.2f\n", no, dno);
	}
	
	public void print(double dno, int no) {
		System.out.printf("오버로딩함수 no = %d dno = 5.2f\n", no, dno);
	}
	
//	public void print(double dvalue, int intno) {
//		System.out.printf("오버로딩함수 no = %d dno = 5.2f\n", intno, dvalue);
//	} // 오버로딩 에러
	
	public void print(String str, int no) {
	System.out.printf("오버로딩함수 no = %d string = %s\n", no, str);
	} // 오버로딩 에러
	
	
}
