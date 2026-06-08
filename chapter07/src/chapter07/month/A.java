package chapter07.month;

import java.util.Arrays;

public class A {
	
	public A() {
		super();
	}

	//기능 리턴x print함수 매변x 안녕출력
	public void print() {
		System.out.println("안녕");
	}
	
	//기능 리턴int data함수 매변x 3리턴
	public int data() {
		return 3;
	}
	
	//기능 리턴double sum함수 매변x int a double b / a+b리턴
	public double sum(int a, double b) {
		return a+b;
	}
	
	//기능 리턴x printMonth함수 매변x int m / 0<=m<=12 아닐때 잘못된입력후 리턴 / 범위내일때 m월달 출력
	public void printMonth(int m) {
		if ( m<=0 || m>12 ) {
			System.out.println("잘못된 값 입력");
			return;
		}
		else {
			System.out.printf("%d월달 \n", m);
		}
	}
	
	//정적맴버함수(객체생성 없이 멤버함수 사용)
	public static void staticPrint() {
		System.out.println("정적 안녕");
	}
	
	public static double staticSum(int a, double b) {
		return a+b;
	}
	public static void intArrayPrint(int[] array1) {
		System.out.printf("%s\n", Arrays.toString(array1));
	}
}
