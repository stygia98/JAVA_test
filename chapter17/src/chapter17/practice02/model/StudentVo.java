package chapter17.practice02.model;

import java.util.Objects;

public class StudentVo implements Comparable<StudentVo> {
	private String name;
	private int id;
	
	private int kor;
	private int math;
	private int eng;
	
	private int total;
	private double avg;
	private int rank;
		
	public StudentVo() {
		this(null, 0, 0, 0, 0);
	}

	public StudentVo(String name, int id, int kor, int math, int eng) {
		super();
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		calcSumAvg();
	}

	public StudentVo(StudentVo s) {
		super();
		this.name = s.name;
		this.id = s.id;
		this.kor = s.kor;
		this.math = s.math;
		this.eng = s.eng;
		this.total = s.total;
		this.avg = s.avg;
		this.rank = s.rank;
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

	public void calcSumAvg() {
		this.total = this.kor + this.math + this.eng;
		this.avg = Math.round((this.total / 3.0)*100) / 100.0;		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equalsCheck = false;
		
		if(obj instanceof StudentVo) {
			StudentVo svo = (StudentVo) obj;
			if(this.name.equals(svo.name) && (this.id == svo.id)) equalsCheck = true;
		}
		
		return equalsCheck;
	}

	@Override
	public String toString() {
		return String.format("%s(%s)-국어:%d 수학:%d 영어:%d | 총점:%d 평균:%.2f 석차:%d\n", 
		        name, id, kor, math, eng, total, avg, rank);
	}
	
//	public String toStringForRank() {
//		return String.format("%s(%s)-국어:%d 수학:%d 영어:%d | 총점:%d 평균:%.2f 석차:%d\n", 
//		        name, id, kor, math, eng, total, avg, rank);
//	}
	
	@Override
	public int compareTo(StudentVo o) {
		int compareCheck = o.getTotal()-this.getTotal();
		
		if(compareCheck == 0)
			compareCheck = o.getName().compareTo(this.getName());
		
		return compareCheck;
	}
	
}

