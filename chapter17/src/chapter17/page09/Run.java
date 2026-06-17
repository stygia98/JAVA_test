package chapter17.page09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Run {
	public static void main(String[] args) {
		//List ArrayList Vector LinkedList
		
		@SuppressWarnings("unused")
		List<String> aList1 = new ArrayList<String>(50);
		@SuppressWarnings("unused")
		List<String> aList2 = new Vector<String>(50);
		@SuppressWarnings("unused")
		List<String> aList3 = new LinkedList<String>();
		
		//정적리스트로 변경 크기변경불가
		Arrays.asList();
		List<String> aList4 = Arrays.asList("a", "b", "c");
			System.out.println(aList4);
		aList4.set(1, "k");
			System.out.println(aList4);
		
			System.out.println();
		//=================================================
		List<String> aList5 = new ArrayList<String>();
		aList5.add("a"); aList5.add("b"); aList5.add("c"); aList5.add("d"); aList5.add("e");
			System.out.println(aList5);
		aList5.clear();
			System.out.println(aList5);
		
		if(aList5.isEmpty()) {
			System.out.printf("aList5 : 자료없음 / size : %d\n", aList5.size());
		}
		
		List<String> aList6 = new ArrayList<String>();
		aList6.add("a"); aList6.add("b"); aList6.add("c"); aList6.add("d"); aList6.add("e");
		
		Object[] oArray1 = aList6.toArray();
		String[] oArray2 = aList6.toArray(new String[0]);
			System.out.println(Arrays.toString(oArray1));
			System.out.println(Arrays.toString(oArray2));

		
		
	}

}
