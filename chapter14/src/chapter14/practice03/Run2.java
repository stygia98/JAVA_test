package chapter14.practice03;

//import java.io.IOException;
import java.io.InputStreamReader;

public class Run2 {

	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(System.in);) {
			System.out.print("값 입력 : ");
			char charValue = (char)isr.read();
			System.out.printf("키보드로부터 받은 문자는 : %c\n", charValue);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
//		InputStreamReader isr = null; 
//		char[] buffer = new char[10];
//		
//		try {
//			isr= new InputStreamReader(System.in);
//			System.out.print("값 입력 :");
//
//			int readCount = isr.read(buffer);
//			System.out.printf("readCount = %d, 문자열 %s\n", readCount, Arrays.toString(buffer));
//			
//			char charValue = (char)isr.read();
//			System.out.printf("키보드로부터 받은 문자는 : %c\n", charValue);
//			
//		} catch (IOException e) {
//			System.out.println("System.in 에러");
//			e.printStackTrace();
//		} finally {
//			if(isr != null)
//				try {
//					isr.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//		}
//		
//		try {
//			scan.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
