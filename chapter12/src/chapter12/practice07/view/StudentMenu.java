package chapter12.practice07.view;

import chapter12.practice07.Run;
import chapter12.practice07.controller.StudentController;
import chapter12.practice07.model.Student;

public class StudentMenu {
	private StudentController sc;

	public StudentMenu() {
		super();
		this.sc = new StudentController();
	}

	public void studentInfoDisplay() {

		boolean exitFlag = false;

		while (!exitFlag) {
			System.out.println("============== 프로그램 시작 ==============");
			System.out.println("0:종료, 1:입력, 2:출력, 3:정렬, 4:총계, 5:평균, 6:검색, 7:등수");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(Run.scanner.nextLine());

			switch (no) {
			case 0:
				exitFlag = true;
				break;
			case 1:
				insertStudent();
				break;
			case 2:
				selectStudent();
				break;
			case 3:
				sortStudent();
				break;
			case 4:
				sumTotal();
				break;
			case 5:
				avgRentCount();
				break;
			case 6:
				searchStudentNoName();
				break;
			case 7:
				rankStudent();
				break;
			default:
				System.out.println("잘못된 번호 입력");
				break;
			}// end switch
		} // end while
		System.out.println("============== 프로그램 종료 ==============");
	}

	private void insertStudent() {
		System.out.println("============== 학생 정보 입력 =============");
		sc.insertStudent();
	}

	private void selectStudent() {
		System.out.println("============== 학생 정보 출력 =============");
		Student[] sArr = sc.selectStudent();
//		if (bArr = )
		for (Student student : sArr) {
			System.out.printf("%s \n", student.toString());
		}
	}

	private void sortStudent() {
		System.out.println("============== 학생 등수 정렬 =============");
		Student[] sArr = sc.sortStudent();
		for (Student student : sArr) {
			System.out.println(student.toString());
		}
	}

	private void sumTotal() {
		System.out.println("============== 점수 합계 출력 =============");
		int sum = sc.sumTotal();
		System.out.printf("학급 점수 총계 : %5d \n", sum);
	}

	private void avgRentCount() {
		System.out.println("============== 점수 평균 출력 =============");
		double avg = sc.avgTotal();
		System.out.printf("학급 점수 평균 : %.2f \n", avg);
	}

	private void searchStudentNoName() {
		System.out.println("================ 학생 검색 ===============");
		System.out.print("검색할 이름 : ");
		String name = Run.scanner.nextLine();
		System.out.print("검색할 번호 : ");
		String no = Run.scanner.nextLine();
		Student student = sc.searchStudentNoName(name, no);
		
		if (student != null) {
			System.out.printf("학생정보 : %s\n", student.toString());
		} else {
			System.out.printf("찾는 정보가 없습니다.\n");
		}
	}

	private void rankStudent() {
		Student[] sArr = sc.rankStudent();
		for (Student s : sArr) {
			System.out.println(s.toString() + s.getRank());
		}
	}
	
	
//	private void setGrade() {
//		System.out.println("============ 도서 대여 횟수 정렬 ===========");
//		for (int i = 0; i < bArr.length; i++) {
//			if (bArr[i].getRentCount() > bcm.getCUT_LINE())
//				System.out.printf("%s - 인기도서입니다 \n", bArr[i].getTitle());
//			else
//				System.out.printf("%s - 일반도서 \n", bArr[i].getTitle());
//		}
//	}

}
