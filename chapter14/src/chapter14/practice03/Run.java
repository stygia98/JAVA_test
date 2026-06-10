package chapter14.practice03;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Run {
	public static void main(String[] args) {
		//finally 에서 자원 반납
		//키보드 파일 네트워크 전송 byte로 오는 입력 처리 2byte char 변형 값을 읽음
		Scanner scan = new Scanner(System.in);
				
		InputStreamReader isr = null; 
		@SuppressWarnings("unused")
		char[] buffer = new char[10];
		
		try {
			isr= new InputStreamReader(System.in);
			System.out.print("값 입력 :");

//			int readCount = isr.read(buffer);
//			System.out.printf("readCount = %d, 문자열 %s\n", readCount, Arrays.toString(buffer));
			
			char charValue = (char)isr.read();
			System.out.printf("키보드로부터 받은 문자는 : %c\n", charValue);
			
		} catch (IOException e) {
			System.out.println("System.in 에러");
			e.printStackTrace();
		} finally {
			if(isr != null)
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		try {
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
