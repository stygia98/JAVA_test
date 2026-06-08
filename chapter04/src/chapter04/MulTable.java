package chapter04;

import java.util.Scanner;

public class MulTable {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		for (; true;) {
			System.out.println("0:exit");
			System.out.println("1: 9page, 2: 15page, 3:구구단, 4:forbreak");
			System.out.print(">>");

			int no = Integer.parseInt(scanner.nextLine());
			System.out.println();

			// 실행하는 함수 선택
			switch (no) {
				case 0: break;
				case 1: practice1(); break;
				case 2: practice2(); break;
				case 3: practice3(); break;
				case 4: practice4(); break;
//				case 5: practice5(); break;
//				case 6: practice6(); break;
//				case 7: practice7(); break;
//				case 8: practice8(); break;
//				case 9: practice9(); break;
//				case 10: practice10(); break;
			default:
				System.out.println("잘못된 값 입력");
				break;
			}
			if (no == 0)
				System.out.println("종료");
			break;
		}
		if (scanner != null)
			scanner.close();
	}



	private static void practice1() {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(scanner.nextLine());
		switch (no) {
		case 10:
		case 9:
		case 8:
		case 7:
//			System.out.println("Pass"); break;
//			System.out.println("Pass"); break;
//			System.out.println("Pass"); break;
			System.out.println("Pass");
			break;
		default:
			System.out.println("Fail");
			break;

		}
	}

	private static void practice2() {
		for (int i = 10; i > 0; i--)
			System.out.printf("%3d", i);
		System.out.println();

		for (int i = 10; i > 0; i = i - 2)
			System.out.printf("%3d", i);
		System.out.println();

		for (int i = 0, j = 0; i < 10; i += 2, j += 3) {
			System.out.printf("i=%-3d", i);
			System.out.printf("j=%-3d\n", j);
		}
		System.out.println();

		for (int i = 0; i < 10; i += 2)
			System.out.printf("i=%-3d\n", i);
		System.out.println();

		int i = 0;
		while (i < 10) {
			System.out.printf("i=%-3d\n", i);
			i += 2;
		}
	}

	private static void practice3() {
		//구구단 출력
		for (int j = 0; j < 9; j++) {
			System.out.printf("%5d단\n", j);
			for (int i = 0; i < 9; i++) {
				System.out.printf("%d * %d = %d\n", j+1, i+1, (j+1)*(i+1));
			}
		}
	}

	private static void practice4() {
		OUT: for (int j = 0; j < 9; j++) {
			System.out.printf("%d단\n", j+1);
			for (int i = 0; i < 9; i++) {
				System.out.printf("%d * %d = %d\n" , j+1, i+1, (j+1)*(i+1));
				if(i==7) break OUT;
			}
		}
		System.out.println("반복문 종료");

	}
	
}
