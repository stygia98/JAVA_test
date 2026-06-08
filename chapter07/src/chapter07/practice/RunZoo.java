package chapter07.practice;

import java.util.Scanner;

public class RunZoo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("0번:Exit 1번:zoo 2번:Product 3번:Member");
			System.out.print("번호 입력 : ");
			int no = Integer.parseInt(scan.nextLine());
			
			switch(no) {
				case 0: System.out.println("프로그램 종료"); exitFlag = true; break;
				case 1: practice01(); break;
				case 2: practice02(); break;
				default: System.out.println("잘못된 번호 입력"); break;
			}
		}
		if(scan != null) scan.close();
	}
	
	private static void practice01() {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo("동물원", "성남");

		boolean exitFlag = false;
		
		while(!exitFlag) {
			int animalCount = zoo.getAnimalCount();
			
			if(animalCount >= 5) {
				System.out.println("마리수 초과");
				exitFlag = true;
			} else {
				System.out.print("입소시킬 동물 이름 : ");
				String animalName = scan.nextLine();
				zoo.addAnimal(animalName);
			}

		}
//		animalCount = zoo.addAnimal("사자");
//		animalCount = zoo.addAnimal("원숭이");
//		animalCount = zoo.addAnimal("코끼리");
		
		System.out.printf("동물원 정보 : %s\n", zoo.toString());
	}
	
	
	private static void practice02() {
		Zoo[] zooArray = new Zoo[3];
		
		for (int i = 0; i < zooArray.length; i++) {
			zooArray[i] = new Zoo();
			System.out.print("동물원 이름 : ");
			zooArray[i].setName(scan.nextLine());
			System.out.print("동물원 위치 : ");
			zooArray[i].setLocation(scan.nextLine());
			
			boolean exitFlag = false;
			while(!exitFlag){
				int animalCount = zooArray[i].getAnimalCount();
				if(animalCount >=5 ) {
					System.out.println("동물원 초과");
					exitFlag = true;
				} else {
					System.out.print("입소시킬 동물 이름 : ");
					String animalName = scan.nextLine();
					zooArray[i].addAnimal(animalName);
				} // end if
			} // end while
			System.out.printf("%d 번째 동물 세팅완료\n", i+1);
		} //end for
		
		for (int i = 0; i < zooArray.length; i++) {
			System.out.printf("동물원 정보 출력 %s\n", zooArray[i].toString());
		}
		
		
	}


}
