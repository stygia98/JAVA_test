package chapter12.practice07.model;

import java.util.Objects;

public class Student {
	private String name;
	private String no;
	private int kor;
	private int math;
	private int eng;
	private int total;
	private double avg;
	private int rank;
			
	public Student() {
		this(null, null, 0, 0, 0);
	}

	public Student(String name, String no, int kor, int math, int eng) {
		super();
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3.0;
	}

	public Student(Student student) {
		this.name = student.name;
		this.no = student.no;
		this.kor = student.kor;
		this.math = student.math;
		this.eng = student.eng;
		this.total = student.total;
		this.avg = student.avg;
		this.rank = student.rank;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getNo() {return no;}
	public void setNo(String no) {this.no = no;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getTotal() {return total;}
	public void setTotal(int total) {this.total = total;}
	public double getAvg() {return avg;}
	public void setAvg(double avg) {this.avg = avg;}
	public int getRank() {return rank;}
	public void setRank(int rank) {this.rank = rank;}

	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equalsFlag = false;
		
		if(obj instanceof Student)
			equalsFlag = true;
		
		Student s = (Student) obj;
		if(name.equals(s.name) && no.equals(s.no))
			equalsFlag = true;
		
		return equalsFlag;
	}

	@Override
	public String toString() {
		return "[이름 : " + name + " / 번호 : " + no + " / 국어 : " + kor + " / 수학 : " + math + " / 영어 : " + eng + " / 총계 : " + total + " / 평균 : " + avg + "]";
	}
	
}
