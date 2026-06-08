package chapter06.student;

public class StudentMain {

	public static void main(String[] args) {
//		Student stu1 = new Student("철수", 100, 100, 100);
//		Student stu2 = new Student("영희", 90, 90, 90);
//		Student stu3 = new Student("길동", 80, 80, 80);
		
		StudentClass[] stuArray = new StudentClass[3];
		
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i] = new StudentClass("철수", 100, 100, 100);
		}
		
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i].sumCalc();
		}
		
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i].studentPrint();
		}
		
//		stu1.sumCalc();
//		stu2.sumCalc();
//		stu3.sumCalc();
//		stu1.studentPrint();
//		stu2.studentPrint();
//		stu3.studentPrint();

	}

}
