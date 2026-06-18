package chapter17.page0136;

import java.util.LinkedList;
import java.util.Queue;

public class Run {
	public static void main(String[] args) {
		// Queue
		Queue<Data> q = new LinkedList<Data>();
		
		// offer
		q.offer(new Data(1));
		q.offer(new Data(2));
		q.offer(new Data(3));
		q.offer(new Data(4));
		q.offer(new Data(5));
	
		System.out.println(q);
		
		// peek
		System.out.printf("q.peek() = %s\n", q.peek());
		System.out.printf("q.size() = %s\n", q.size());
		
		// poll
		System.out.printf("q.poll() = %s\n", q.poll());
		System.out.printf("q.size() = %s\n", q.size());
		System.out.println(q);

		System.out.printf("q.poll() = %s\n", q.remove());
		System.out.printf("q.poll() = %s\n", q.remove());
		System.out.printf("q.poll() = %s\n", q.remove());
		System.out.printf("q.poll() = %s\n", q.remove());
//		System.out.printf("q.poll() = %s\n", q.remove()); // NoSuchElementException
		System.out.printf("q.poll() = %s\n", q.poll());

		
		
	}

}
