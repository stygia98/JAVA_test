package com.himedia.exam01;

import java.util.Scanner;

public class AlbumRun {
	static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		
		boolean exitFlag = false;
		
		while (!exitFlag) {
			System.out.println("0:프로그램종료, 1:1번문제");
			System.out.print("번호입력 : ");
			int select1 = Integer.parseInt(scanner.nextLine());
			
			switch (select1) {
				case 1: practice01(); break;
				case 0: System.out.println("프로그램 종료"); exitFlag = true; break;
				default: System.out.println("잘못된 값 입력"); break;
			}
		}
		if(scanner!=null) scanner.close();

	}

	private static void practice01() {
		System.out.println("===============1번 프로그램 시작=================");
		
		final int COUNTMAX = 4;
		int count = 0;
		AlbumClass[] albumArray = new AlbumClass[COUNTMAX];
		
//		albumArray[0] = new AlbumClass("APT.", "로제", "rosie", "2024.10.18" );
//		albumArray[1] = new AlbumClass("한페이지", "Day6", "Gravity", "2019.07.15" );
//		albumArray[2] = new AlbumClass("후라이의꿈", "AKMU", "Love Lee", "2023.08.21" );
//		albumArray[3] = new AlbumClass("ditto", "뉴진스", "NewJeans", "2022.12.19" );
	
		
		
		boolean stopFlag = false;
		while(!stopFlag) {
			for (int i = 0; i < COUNTMAX; i++) {
				albumArray[i] = new AlbumClass();
				System.out.println("노래 정보 입력하기");
				System.out.print("곡명 : ");
				albumArray[i].setTitle(scanner.nextLine());
				System.out.print("가수 : ");
				albumArray[i].setArtist(scanner.nextLine());
				System.out.print("앨범 : ");
				albumArray[i].setAlbum(scanner.nextLine());
				System.out.print("발매일 : ");
				albumArray[i].setRelease(scanner.nextLine());
//				albumArray[i] = new AlbumClass
//						(albumArray[i].getTitle(), albumArray[i].getArtist(), albumArray[i].getAlbum(), albumArray[i].getRelease());
				count++;
			}
			
			if(COUNTMAX == count) stopFlag = true;
		}
		
		for (int i = 0; i < albumArray.length; i++) {
			albumArray[i].printInform();
		} //end for

		System.out.println("\n===============1번 프로그램 종료=================");


		
		
	}	
}


