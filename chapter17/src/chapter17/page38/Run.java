package chapter17.page38;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Run {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// ArrayList LinkedList 속도차이

		List<Integer> aList1 = new ArrayList<Integer>();
		List<Integer> lList1 = new LinkedList<Integer>();
		
		System.out.println("add()");
		long startTime1 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			aList1.add(0, new Integer(i));
		}
		long endTime1 = System.nanoTime();
		
		System.out.printf("aList %d회 시간 %d\n", aList1.size(), endTime1-startTime1);
		
		long startTime2 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			lList1.add(0, new Integer(i));
		}
		long endTime2 = System.nanoTime();
		
		System.out.printf("lList %d회 시간 %d\n", lList1.size(), endTime2-startTime2);

		//=======================================================================================
		
		System.out.println("get()");
		
		long startTime3 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			aList1.get(i);
		}
		long endTime3 = System.nanoTime();
		
		System.out.printf("aList %d회 시간 %d\n", aList1.size(), endTime3-startTime3);
		
		long startTime4 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			lList1.get(i);
		}
		long endTime4 = System.nanoTime();
		
		System.out.printf("lList %d회 시간 %d\n", lList1.size(), endTime4-startTime4);
		
		//=======================================================================================
		
		System.out.println("remove()");
		
		long startTime5 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			aList1.remove(0);
		}
		long endTime5 = System.nanoTime();
		
		System.out.printf("aList %d회 시간 %d\n", 100_000-aList1.size(), endTime5-startTime5);
		
		long startTime6 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			lList1.remove(0);
		}
		long endTime6 = System.nanoTime();
		
		System.out.printf("lList %d회 시간 %d\n", 100_000-lList1.size(), endTime6-startTime6);
		
		
	}

}
