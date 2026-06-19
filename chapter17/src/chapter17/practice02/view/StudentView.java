package chapter17.practice02.view;

import java.util.List;
import java.util.Scanner;

import chapter17.practice02.controller.StudentController;
import chapter17.practice02.model.StudentVo;

public class StudentView {
	private StudentController sc;
	private Scanner scan;

	public StudentView() {
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
			System.out.println("6. 총점 내림차순 정렬");
			System.out.println("7. 이름 오름차순 정렬");
			System.out.println("8. Test용 더미 자료 입력");
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
			case 7:	sortByNameAsc(); break;
			case 8:	addDummy(); break;
			default: System.out.println("잘못된 번호 입력"); break;
			}// end switch
		} // end while
		
		if(scan != null) scan.close();
		System.out.println("***** 프로그램종료 *****");
	} // end func (display) 

	private void addDummy() {
		sc.addStudent(new StudentVo("홍길동1", 260601, 90, 19, 90));
		sc.addStudent(new StudentVo("홍길동2", 260602, 90, 80, 37));
		sc.addStudent(new StudentVo("홍길동3", 260603, 81, 54, 72));
		sc.addStudent(new StudentVo("홍길동4", 260604, 77, 67, 74));
		sc.addStudent(new StudentVo("홍길동5", 260605, 50, 90, 93));
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
		
		int check = sc.addStudent(new StudentVo(name, no, kor, math, eng));
		
		if(check == 1) System.out.println("추가 완료");
		else System.out.println("추가 실패");
	}
	
	private void printAll() {
		System.out.println("﻿****** 전체 학생 목록 출력 ******");
		List<StudentVo> sL = sc.printAll();
		
		if(sL!= null) System.out.println(sL);
		else System.out.println("정보가 없습니다");
		
	}
	
	private void searchStudent() {
		System.out.print("검색할 이름 : ");
		String name = scan.nextLine();
		System.out.print("검색할 번호 : ");
		int id = Integer.parseInt(scan.nextLine()); 
		StudentVo student = sc.searchStudent(name, id);
		
		if(student != null) System.out.println(student);
		else System.out.println("검색 실패");
	}
	
	private void removeStudent() {
		System.out.print("삭제할 이름 : ");
		String name = scan.nextLine();		
		System.out.print("삭제할 번호 : ");
		int id = Integer.parseInt(scan.nextLine()); 
		StudentVo student = sc.removeStudent(name, id);
		
		if(student != null) System.out.printf("%s\n삭제 완료\n", student);
//		if(student != null) System.out.println("삭제 완료");
		else System.out.println("삭제 실패");
	}

	private void updateStudent() {
		System.out.print("수정할 이름 : ");
		String name = scan.nextLine();
		System.out.print("수정할 번호 : ");
		int id = Integer.parseInt(scan.nextLine()); 	
		
		StudentVo svo = new StudentVo(name, id, (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100));
		StudentVo student = sc.searchStudent(svo.getName(), svo.getId());
		
		if(student != null) sc.updateStudent(id, name, svo);
		else System.out.println("업데이트 실패");
	}
	
	private void sortByTotalDesc() {
		System.out.println("﻿****** 석차순 정렬 ******");
		List<StudentVo> sl = sc.sortByTotalDesc();
		
		if(sl != null) System.out.println(sl);
		else System.out.println("정렬 실패");
		
	}

	private void sortByNameAsc() {
		List<StudentVo> sl = sc.sortByNameAsc();
		
		if(sl != null) System.out.println(sl);
		else System.out.println("정렬 실패");	
	}
	
} // end class
