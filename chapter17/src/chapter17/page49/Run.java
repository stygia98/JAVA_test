package chapter17.page49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		// set 중복 삽입 불가 equals hashCode
		// TreeSet 정렬 검색 특화 comparable 구현
		
		// new
		Set<Data> hset1 = new HashSet<Data>();
		
		// add();
		hset1.add(new Data(1, "a"));
		hset1.add(new Data(1, "b"));
		hset1.add(new Data(1, "c"));
		hset1.add(new Data(1, "a"));
		
		System.out.println(hset1.toString());
		
		// remove();
		hset1.remove(new Data(1, "a"));
		System.out.println(hset1.toString());

		// get();x -> for each;
		for (Data data : hset1) {
			System.out.print(data);
		}
		System.out.println();
		
		// clear();
		hset1.clear();
		System.out.println(hset1.toString());
		
		//isEmpty();
		System.out.println(hset1.isEmpty());
		
		// new
		Set<Data> hset2 = new HashSet<Data>();
		hset2.add(new Data(1, "a"));
		hset2.add(new Data(1, "b"));
		hset2.add(new Data(1, "c"));
		
		// contains();
		System.out.println(hset2.contains(new Data(1, "a")));
		System.out.println(hset2.contains(new Data(1, "d")));
		
		// size();
		System.out.println(hset2.size());
		
		//iterate
		Iterator<Data> iterator = hset2.iterator();
		while (iterator.hasNext()) {
			Data data = iterator.next();
			System.out.print(data);
		}
		
			System.out.println();
		
		for (Data data : hset2) {
			System.out.print(data);
		}
		
		for (int i = 0; i < hset2.size(); i++) {
			
		}
		
	}

}
