package mvc.practice04.controller;

import java.util.ArrayList;
import java.util.List;

import mvc.practice04.model.Student;

public class StudentController {
	private List<Student> sL;

	public StudentController() {
		super();
		this.sL = new ArrayList<Student>();
	}

	public int addStudent(Student student) {
		sL.add(student);
		student.setTotal(student.getKor() + student.getMath() + student.getEng());
		student.setAvg((double)(student.getKor() + student.getMath() + student.getEng()) / (double)sL.size());
		return 1;
	}
	
	public List<Student> printAll() {
		return sL;
	}
	
	public Student searchStudent(String name){
		for (Student student : sL) {
			if(student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}
	
	public Student removeStudent(String name){
		for (Student student : sL) {
			if(student.getName().equals(name)) {
				sL.remove(student);
				return student;
			}
		}
		return null;
	}

	public Student updateStudent(String name, Student student){
		
		return null;
	}
	
	public int sortByTotalDesc() {
		
		return 0;
	}

	
}
