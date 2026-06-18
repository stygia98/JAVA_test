package mvc.practice04.view;

import java.util.List;
import java.util.Scanner;
import mvc.practice04.controller.StudentController;
import mvc.practice04.model.Student;

public class StudentView {
	private StudentController sc;
	private Scanner scan;

	public StudentView() {
		super();
		this.sc = new StudentController();
		this.scan = new Scanner(System.in);
	}
	
	public void display() {
		boolean exitFlag = false;

		while (!exitFlag) {
			System.out.println("***** 학생 성적 관리 메뉴 *****");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 전체 학생 목록 출력");
			System.out.println("3. 특정 학생 검색");
			System.out.println("4. 특정 학생 삭제");
			System.out.println("5. 특정 학생 정보 수정");
			System.out.println("6. 총점 내림차순 정렬 및 석차 부여");
			System.out.println("7. Test용 더미 자료 입력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : >> ");
			
			int no = Integer.parseInt(scan.nextLine());

			switch (no) {
			case 0:	exitFlag = true; break;
			case 1:	addStudent(); break;
			case 2:	printAll(); break;
			case 3:	searchStudent(); break;
			case 4:	removeStudent(); break;
			case 5:	updateStudent(); break;
			case 6:	sortByTotalDesc(); break;
			case 7:	addDummy(); break;
			default: System.out.println("잘못된 번호 입력"); break;
			}// end switch
		} // end while
		
		if(scan != null) scan.close();
		System.out.println("***** 프로그램종료 *****");
	} // end func (display) 

	private void addDummy() {
		sc.addStudent(new Student("홍길동1", 260601, 90, 19, 90));
		sc.addStudent(new Student("홍길동2", 260602, 90, 80, 37));
		sc.addStudent(new Student("홍길동3", 260603, 81, 54, 72));
		sc.addStudent(new Student("홍길동4", 260604, 77, 67, 74));
		sc.addStudent(new Student("홍길동5", 260605, 50, 90, 93));
	}

	private void addStudent() {
		System.out.println("﻿****** 학생 정보 추가 ******");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("번호 : ");
		int no = Integer.parseInt(scan.nextLine());
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(scan.nextLine());
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(scan.nextLine());
		
		int check = sc.addStudent(new Student(name, no, kor, math, eng));
		
		if(check == 1) System.out.println("추가 완료");
		else System.out.println("추가 실패");
	}
	
	private void printAll() {
		System.out.println("﻿****** 전체 학생 목록 출력 ******");
		List<Student> sL = sc.printAll();
		
		if(!(sL.isEmpty()))
			for (Student temp : sL)	System.out.println(temp);
		else System.out.println("자료가 없습니다");
	}
	
	private Student searchStudent() {
		System.out.println("﻿****** 학생 검색 ******");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		Student student = sc.searchStudent(name);
		
		if(student != null) System.out.printf("%s\n검색 완료\n", student);
		else System.out.println("검색 실패");

		return student;
	}
	
	private void removeStudent() {
		Student searchStudent = searchStudent();
		
//		System.out.print("이름 : ");
//		String name = scan.nextLine();
		Student student = sc.removeStudent(searchStudent.getName());
		
//		if(student != null) System.out.printf("%s\n삭제 완료\n", student);
		if(student != null) System.out.println("삭제 완료");
		else System.out.println("삭제 실패");
	}

	private void updateStudent() {
		Student searchStudent = searchStudent();
		
		if (searchStudent != null) {
			System.out.print("이름 수정 : ");
			String name = scan.nextLine();
			System.out.print("번호 수정 : ");
			int no = Integer.parseInt(scan.nextLine());
			System.out.print("국어 점수 수정 : ");
			int kor = Integer.parseInt(scan.nextLine());
			System.out.print("수학 점수 수정 : ");
			int math = Integer.parseInt(scan.nextLine());
			System.out.print("영어 점수 수정 : ");
			int eng = Integer.parseInt(scan.nextLine());
	
			String searchName = searchStudent.getName();
			Student newStudent = sc.updateStudent(searchName, new Student(name, no, kor, math, eng));
			
			if(newStudent != null) System.out.printf("%s\n수정 완료\n", newStudent);
			else System.out.println("수정 실패");
		} // end if
	}
	
	private void sortByTotalDesc() {
		System.out.println("﻿****** 석차순 정렬 ******");
		int check = sc.sortByTotalDesc();
		
		if(check == 1) {
			List<Student> sL = sc.copyPrintAll();
			for (Student temp : sL) System.out.println(temp.toStringForRank());
			System.out.println("정렬완료");
		} 
		else if (check == 2) System.out.println("\n자료없음");
		else if (check == 0) System.out.println("\n정렬실패");
	}

} // end class
