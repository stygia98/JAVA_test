package chapter17.practice01.view;

import java.util.List;
import java.util.Scanner;
import chapter17.practice01.controller.MusicController;
import chapter17.practice01.model.Music;

public class MusicView {
	private Scanner sc;
	private MusicController mc;

	public MusicView() {
		super();
		this.sc = new Scanner(System.in);
		this.mc = new MusicController();
	}

	public void mainMenu() {
		boolean exitFlag = false;

		while (!exitFlag) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 선택 : >>");
			
			int no = Integer.parseInt(sc.nextLine());

			switch (no) {
			case 0:	exitFlag = true; break;
			case 1:	addList(); break;
			case 2:	addAtZero(); break;
			case 3:	printAll(); break;
			case 4:	serachMusic(); break;
			case 5:	removeMusic(); break;
			case 6:	setMusic(); break;
			case 7:	ascTitle(); break;
			case 8:	descSinger(); break;
			default: System.out.println("잘못된 번호 입력"); break;
			}// end switch
		} // end while
		
		if (sc != null) sc.close();
		System.out.println("==============  프로그램종료 ==============");
	}

	private void addList() {
		System.out.println("============= 첫 위치에 곡 추가 ============");
		System.out.print("add title >>");
		String title = sc.nextLine();
		System.out.print("add singer >>");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		int result = mc.addList(music);
		
		if (result == 1) {System.out.printf("%s 등록 완료\n", music);}
		else {System.out.printf("%s 등록 실패\n", music);}	
	}

	private void addAtZero() {
		System.out.println("=========== 마지막 위치에 곡 추가 ===========");
		System.out.print("add title >>");
		String title = sc.nextLine();
		System.out.print("add singer >>");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		int result = mc.addAtZero(music);
		
		if (result == 1) {System.out.printf("%s 등록 완료\n", music);}
		else {System.out.printf("%s 등록 실패\n", music);}
	}

	private void printAll() {
		System.out.println("============= 전체 곡 목록 출력 ============");
		List<Music> mlist = mc.sortPrintAll();
		
		if(mlist != null) {System.out.println(mlist);}
		else {System.out.println("출력실패");}
		
	}

	private void serachMusic() {
		System.out.println("================ 곡 검색 ================");
		System.out.print("search title >>");
		String title = sc.nextLine();
		Music music = mc.serachMusic(title);
		
		if(music != null) {System.out.printf("검색된 음악 : %s\n", music);}
		else {System.out.printf("%s : 검색되지 않음\n", title);}
		
	}

	private void removeMusic() {
		System.out.println("================= 곡 삭제 ===============");
		System.out.print("delete title >>");
		String title = sc.nextLine();
		Music music = mc.removeMusic(title);
		
		if(music != null) {System.out.printf("삭제된 음악 : %s\n", music);}
		else {System.out.printf("%s : 검색되지 않음\n", music);}
	}

	private void setMusic() {
		System.out.println("============ 입력된 곡 정보 수정 ===========");
		System.out.print("old title >>");
		String oldTitle = sc.nextLine();
		System.out.print("new title >>");
		String title = sc.nextLine();
		System.out.print("new singer >>");
		String singer = sc.nextLine();
		
		Music music = new Music(oldTitle, singer);
		Music newMusic = mc.setMusic(title, music);
		
		if(newMusic != null) {System.out.printf("수정된 음악 : %s\n", newMusic);}
		else {System.out.printf("%s : 검색되지 않음\n", music);}
	}

	private void ascTitle() {
		System.out.println("============ 곡명 오름차순정렬 ===========");
		int result = mc.ascTitle();
		if(result == 1) {
			List<Music> cmList = mc.sortPrintAll();
			System.out.printf("%s", cmList);
			System.out.println("\n정렬완료");
		}
		else {System.out.println("\n정렬실패");}
	}

	private void descSinger() {
		System.out.println("=========== 가수명 내림차순정렬 ==========");
		int result = mc.descSinger();
		if(result == 1) {
			List<Music> cmList = mc.sortPrintAll();
			System.out.printf("%s", cmList);
			System.out.println("\n정렬완료");
		}
		else {System.out.println("\n정렬실패");}
	}

}
