package com.himedia.exam01;

import java.util.Scanner;

public class RecipeRun {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false; // while문 탈출용
		
		while (!exitFlag) {
			System.out.println("0번:종료, 1번:레시피, 2번:동물원, 3번:TEST용");
			System.out.print("입력 : ");
			int no = Integer.parseInt(scanner.nextLine()); // 메인메뉴 입력받기
			
			switch (no) {
				case 1:	recipePractice(); break;
				case 2:	break;
				case 3:	
//					String str = randomString(); 
//					System.out.printf("랜덤문자열 출력 : %s\n", str); 
					break;
				case 0: System.out.println("프로그램 종료"); exitFlag = true; break;
				default: System.out.println("잘못된 번호 입력"); break;
			}//end switch
		}//end while
		
		if(scanner != null) scanner.close(); //스캐너 종료
	}
	
	public static void recipePractice() {
		System.out.print("레시피주제입력 : ");
		String recipeName = scanner.nextLine();
		Recipe recipe = new Recipe(recipeName);
		
		for (int i = 0; i < 5; i++) {
			if(recipe.getIngredientCount() >=5) {
				break;
			}
			recipe.addIngredient(randomString(3, 7));
		}
		
		for (int i = 0; i < 5; i++) {
			if(recipe.getStepCount() >=5) {
				break;
			}
			recipe.addStep(randomString(10, 20));
		}
		
		System.out.printf("레시피출력 : %s\n", recipe.toString());
		
	}
	
	public static String randomString(int start, int end) {
//		String sb = new String() 메모리확장불가
//		StringBuffer 메모리확장가능		
//		String str = new String(""); 사용하지않는 선언법
		
		String str = "";

        int length = (int)(Math.random()*(end - start +1) + start);
        for( int i = 0; i < length; i++) {
        	//문자 Unicode -> 가: 55203 힣: 44032
        	str += (char)((int)(Math.random()*(55203 - 44032 +1) + 44032));
        }
		return str;
	}

}
