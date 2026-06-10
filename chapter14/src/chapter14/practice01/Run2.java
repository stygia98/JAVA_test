package chapter14.practice01;

import java.io.IOException;
import java.io.InputStreamReader;

public class Run2 {

	public static void main(String[] args) {
		//checked exception (InterruptedException)		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//checked exception (ClassNotFoundException)		
		try {
			@SuppressWarnings({ "unused", "rawtypes" })
			Class cls = Class.forName("java.lang.Object");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//checked exception (IOException)		
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
