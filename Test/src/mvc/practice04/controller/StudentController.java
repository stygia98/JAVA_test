package mvc.practice04.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mvc.practice04.model.Student;

public class StudentController {
	private final int SUBJECT_NUM = 3;
	private List<Student> sL;
	private List<Student> copySL;


	public StudentController() {
		super();
		this.sL = new ArrayList<Student>();
		this.copySL = new ArrayList<Student>();
	}

	public int addStudent(Student student) {
		try {
			sL.add(student);
			calcSumAvg(student); // setting the sum & average
			return 1;
		} catch (Exception e) {
			return 0;
		} // end try
	}
	
	public void calcSumAvg(Student student) {
		//calculate the Sum
		student.setTotal(student.getKor() + student.getMath() + student.getEng());
		//calculate the Average
		student.setAvg((double)(student.getKor() + student.getMath() + student.getEng()) / (double)SUBJECT_NUM);
	}
	
	public List<Student> printAll() {
		return sL;
	}
	
	public List<Student> copyPrintAll() {
		return copySL;
	}
	
	public Student searchStudent(String name){
		for (Student student : sL) {
			if(student.getName().equals(name)) {
				return student;
			} // end if
		} // end for
		return null;
	}
	
	public Student removeStudent(String name){
		for (Student student : sL) {
			if(student.getName().equals(name)) {
				sL.remove(student);
				return student;
			} // end if
		} // end for
		return null;
	}

	public Student updateStudent(String name, Student student){
		for (int i = 0; i < sL.size(); i++) {
			if(sL.get(i).getName().equals(name)) {
				sL.set(i, student);
				calcSumAvg(student); // recalculate the sum & average
				return sL.get(i);
			} // end if
		}  // end for
		return null;
	}
	
	
	// return - 0:fail / 1:success / 2:empty
	public int sortByTotalDesc() {
		if(sL.isEmpty()) return 2;
		else {
			copySL.clear(); // clear List for reset
			
			for (Student student : sL) {
				copySL.add(student); // deep copy List
			}
			
			try {
				Collections.sort(copySL, new DescTotal()); // sorting
				setRank(copySL);
				return 1;
			} //end try
			catch (Exception e) {return 0;}
		} // end if
	} // end func
	
	public void setRank(List<Student> sL) {
		int rankCount = 1;
		
		for (int i = 0; i < sL.size(); i++) {
			if(i == 0) sL.get(i).setRank(rankCount);
			
			if(i !=0 && sL.get(i).getTotal() == sL.get(i-1).getTotal())
				sL.get(i).setRank(sL.get(i-1).getRank());
			else sL.get(i).setRank(rankCount);
			
			rankCount++;
		} //end for
	}// end func
}
