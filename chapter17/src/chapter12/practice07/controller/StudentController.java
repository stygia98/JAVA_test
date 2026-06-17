package chapter12.practice07.controller;

import java.util.LinkedList;
import java.util.List;

import chapter12.practice07.model.Student;

public class StudentController {
	//1.생성
	private List<Student> sArr;
	private List<Student> copysArr;
//	private final int COUNT = 5;

	public StudentController() {
//		sArr = new ArrayList<Student>();
//		copysArr = new ArrayList<Student>();
		
		sArr = new LinkedList<Student>();
		copysArr = new LinkedList<Student>();
	}
	//2.입력
	public void insertStudent() {
//		sArr[0] = new Student("홍길동1", "20260601", 100, 10, 54);
//		sArr[1] = new Student("홍길동2", "20260602", 90, 20, 64);
//		sArr[2] = new Student("홍길동3", "20260603", 80, 30, 74);
//		sArr[3] = new Student("홍길동4", "20260604", 70, 40, 84);
//		sArr[4] = new Student("홍길동5", "20260605", 60, 50, 94);
		sArr.add(new Student("홍길동1", "20260601", 100, 10, 54));
		sArr.add(new Student("홍길동2", "20260602", 90, 20, 64));
		sArr.add(new Student("홍길동3", "20260603", 80, 30, 74));
		sArr.add(new Student("홍길동4", "20260604", 70, 40, 84));
		sArr.add(new Student("홍길동5", "20260605", 60, 50, 94));
	}
	
//	public Student[] selectStudent() {
//		return sArr;
//	}
	
	public List<Student> selectStudent() {
		return sArr;
	}
	
	//3.출력
	
	//4.수정
	
	//5.삭제
	
	//6.검색
	public Student searchStudentNoName(String name, String no) {
		Student findStudent = null;
		for (Student s : sArr) {
			if(s.getName().equals(name) && s.getNo().equals(no)) {
				findStudent = s;
				break;
			}
		}
		return findStudent;
	}
	//7.정렬
	public List<Student> sortStudent() {
//		for (int i = 0; i < sArr.size(); i++) {
//			if(sArr.get(i) != null) {
//				copysArr.add(sArr.get(i));
//			}
//		}
		for (Student s : sArr) {
			copysArr.add(new Student(s));
		}
		
		for (int i = 0; i < copysArr.size()-1; i++) {
			for (int j = i; j < copysArr.size(); j++) {
				if(copysArr.get(i).getTotal() < copysArr.get(j).getTotal()) {
					Student buffer = copysArr.get(i);
					copysArr.set(i, copysArr.get(j));
					copysArr.set(j, buffer);
				}
			}
		}
		return copysArr;
	}
	
	//8.기능 - 총계
	public int sumTotal() {
		int sum = 0;
		 
		for (Student s : sArr) {
			if(s != null) {
				sum += s.getTotal();
			}
		}
		return sum;
	}
	//9.기능2 - 평균
	public double avgTotal() {
		return sumTotal() / (double)sArr.size();
	}
	
	//10.기능3 - 석차
	public List<Student> rankStudent() {
		for (int i = 0; i < copysArr.size(); i++) {
			copysArr.get(i).setRank(i+1);
//			if(i==0) {
//				copysArr[i].setRank(i+1);
//			} else if (copysArr[i-1].getTotal() == copysArr[i].getTotal()) {
//				copysArr[i].setRank(copysArr[i-1].getRank());
//			} else {
//				copysArr[i].setRank(i+1);
//			}
//		}
//	
//		for (int i = 0; i < copysArr.length; i++) {
//			for (int j = 0; j < copysArr.length; j++) {
//				if(copysArr[i].getNo().equals(sArr[i].getNo())) {
//					sArr[i].setRank(copysArr[i].getRank());
//					break;
//				}
//			}
		}
		
		return copysArr;
	}
	
}
