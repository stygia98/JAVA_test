package chapter17.page84;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		// new
		Map<Data, String> hm = new HashMap<Data, String>();
		@SuppressWarnings("unused")
		Map<Data, String> syncHm = Collections.synchronizedMap(hm);
		
		
		// put
		hm.put(new Data(1), new String("홍길동1"));
		hm.put(new Data(2), new String("홍길동2"));
		hm.put(new Data(3), new String("홍길동3"));
			System.out.println(hm.toString());
		
		// set
		hm.replace(new Data(2), new String("홍길동4"));
			System.out.println(hm.toString());

		hm.replace(new Data(4), new String("홍길동5"));
			System.out.println(hm.toString());
			
		// get	
			System.out.printf("hm.get(new Data(2)) : %s\n" , hm.get(new Data(2)));
			
		// contains
			System.out.printf("hm.containsKey(new Data(2)) : %b\n", hm.containsKey(new Data(2)));
			System.out.printf("hm.containsValue(new String(\"홍길동1\")) : %b\n", hm.containsValue(new String("홍길동1")));	
		
		// for - key객체 ->set 변경
		Set<Data> mTos = hm.keySet();
			System.out.println(mTos);
			
		for (Data data : mTos) {
			System.out.printf("hm.get(%s) = %s\n", data, hm.get(data));
		}
		
		// entrySet()
		Set<Map.Entry<Data, String>> entrySet = hm.entrySet();
			System.out.println(entrySet);
			
			for (Entry<Data, String> entry : entrySet) {
				System.out.print(entry.getKey());
				System.out.print(entry.getValue());
			}
			
			System.out.println();
		
		// size()
			System.out.printf("map size = %d\n", hm.size());
		
		// remove()
		hm.remove(new Data(3));
			System.out.printf("remove = %s\n", hm);
		
		// clear()
			hm.clear();
		// isEmpty()
			System.out.printf("map isEmpty = %b\n", hm.isEmpty());

			
	}

}
