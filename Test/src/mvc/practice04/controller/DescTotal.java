package mvc.practice04.controller;

import java.util.Comparator;

import mvc.practice04.model.Student;

public class DescTotal implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o2.getTotal()-o1.getTotal();
	}

}
