package chapter17.page06;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		String[] arr = new String[] {"가", "나", "다", "라", "마", "바", "사"};
				
		for (String string : arr) System.out.printf("%5s", string);
		System.out.println();
		
		arr[1] = null;
		arr[3] = null;
		//arr[7] = "아";
		
		for (String string : arr) System.out.printf("%5s", string);
		System.out.println();
		System.out.printf("배열의 크기 %d\n", arr.length);
		System.out.println("array : " + arr);
		System.out.println("array : " + Arrays.toString(arr) + "[추가]");

		//============================================================================
		
		ArrayList<String> aL = new ArrayList<String>();

		aL.add("가"); aL.add("나"); aL.add("다"); aL.add("라"); aL.add("마"); aL.add("바"); aL.add("사");
		
		for (String string : aL) System.out.printf("%5s", string);
		System.out.println();
		System.out.printf("배열의 크기 %d\n", aL.size());

		aL.remove(1); aL.remove(2);
		
		for (String string : aL) System.out.printf("%5s", string);
		System.out.println();
		System.out.printf("배열의 크기 %d\n", aL.size());
		
		//============================================================================
		
		ArrayList<Student> sL = new ArrayList<Student>();
		sL.add(new Student()); sL.add(new Student()); sL.add(new Student());
//		sL.add(new Student()); sL.add(new Student()); sL.add(new Student());
		for (Student student : sL) {
			System.out.println(student);
		}
		System.out.printf("배열의 크기 %d\n", sL.size());
		System.out.println(sL);
		
		
	}
	
}
