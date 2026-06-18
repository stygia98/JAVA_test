package mvc.practice04.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int id;
	
	private int kor;
	private int math;
	private int eng;
	
	private int total;
	private double avg;
	private int rank;
		
	public Student() {
		this(null, 0, 0, 0, 0);
	}

	public Student(String name, int id, int kor, int math, int eng) {
		super();
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
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
		return Objects.hash(name, id);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equalsCheck = false;
		Student s = (Student) obj;
		
		if(obj instanceof Student)
			if(this.name.equals(s.name) && (this.id == s.id))
				equalsCheck = true;
		
		return equalsCheck;
	}

	@Override
	public String toString() {
		return name + id + kor + math + eng + total + avg;
	}

	@Override
	public int compareTo(Student o) {
		
		return 0;
	}
	
}

