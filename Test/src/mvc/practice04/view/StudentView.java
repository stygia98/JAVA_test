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
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : >>");
			int no = Integer.parseInt(scan.nextLine());

			switch (no) {
			case 0:	exitFlag = true; break;
			case 1:	addStudent(); break;
			case 2:	printAll(); break;
			case 3:	searchStudent(); break;
			case 4:	removeStudent(); break;
			case 5:	updateStudent(); break;
			default: System.out.println("잘못된 번호 입력"); break;
			}// end switch
		} // end while
		
		System.out.println("============== 프로그램종료 ==============");
	} // end func (display) 

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
		
		if(check == 1)
			System.out.println("추가성공");
	}
	
	private void printAll() {
		System.out.println("﻿****** 전체 학생 목록 출력 ******");
		List<Student> sL = sc.printAll();
		for (Student temp : sL) {
			System.out.println(temp);
		}
	}
	
	private void searchStudent() {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		Student s = sc.searchStudent(name);
		if(s != null) {
			System.out.println(s.toString());
		}
	}
	
	private void removeStudent() {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		Student s = sc.removeStudent(name);
		if(s != null) {
			System.out.println(s.toString());
		}
		
	}

	private void updateStudent() {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		Student s = sc.searchStudent(name);
		
		System.out.print("번호 : ");
		int no = Integer.parseInt(scan.nextLine());
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(scan.nextLine());
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(scan.nextLine());

//		Student s = new Student(name, no, kor, math, eng);
//		int check = sc.updateStudent(name, s);
		
		if(check == 1)
			System.out.println("추가성공");
		
	}


} // end class
