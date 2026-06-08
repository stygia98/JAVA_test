package chapter06.student;

public class StudentClass {
	//멤버변수
	String name;
	int kor;
	int math;
	int eng;
	int sum;
	
	//디폴트 생성자X -> 매개변수있는 생성자
	public StudentClass(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	//멤버 함수
	void sumCalc() {
		sum = kor + math + eng;
	}
	
	void studentPrint( ) {
		System.out.printf("%-10s %-5d %-5d %-5d %-5d\n", name, kor, math, eng, sum);
	}
}
