package chapter17.page49;

import java.util.SortedSet;
import java.util.TreeSet;

public class Run2 {
	public static void main(String[] args) {
		// TreeSet hashCode equals compareTo
		// new
		TreeSet<Data2> ts = new TreeSet<Data2>();
		
		//add()
		for (int i = 1; i <= 20; i++) {
			int value = (int)(Math.random()*(20-1+1) +1);
			System.out.printf("%2d ",value);
			ts.add(new Data2(value));
		}
		
		//print
		System.out.println();
		
		System.out.printf("ts.size() = %s\n", ts.size());
		System.out.println(ts);
		
		// pollfirst()
		System.out.printf("first() = %s\n", ts.first());
		System.out.printf("ts.size() = %s\n", ts.size());

		System.out.printf("pollfirst() = %s\n", ts.pollFirst());
		System.out.printf("ts.size() = %s\n", ts.size());
		
		// pollLast()
		System.out.printf("last() = %s\n", ts.last());
		System.out.printf("ts.size() = %s\n", ts.size());

		System.out.printf("pollLast() = %s\n", ts.pollLast());
		System.out.printf("ts.size() = %s\n", ts.size());
		
		// lower higher
		System.out.printf("ts.lower(new Data2(10)) = %s\n", ts.lower(new Data2(10)));
		System.out.printf("ts.higher(new Data2(10)) = %s\n", ts.higher(new Data2(10)));

		// floor ceiling
		System.out.printf("ts.floor(new Data2(10)) = %s\n", ts.floor(new Data2(10)));
		System.out.printf("ts.ceiling(new Data2(10)) = %s\n", ts.ceiling(new Data2(10)));
		
		System.out.println(ts);
		// headSet
		SortedSet<Data2> ss1 = ts.headSet(new Data2(10), true);
		System.out.println(ss1);
		// tailSet
		SortedSet<Data2> ss2 = ts.tailSet(new Data2(10), false);
		System.out.println(ss2);
		// subSet
		SortedSet<Data2> ss3 = ts.subSet(new Data2(5), true, new Data2(15), true);
		System.out.println(ss3);
		// descendingSet
		SortedSet<Data2> ss4 = ts.descendingSet();
		System.out.println(ss4);
		
	}

}
