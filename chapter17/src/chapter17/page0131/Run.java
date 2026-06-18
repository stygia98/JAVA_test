package chapter17.page0131;

import java.util.Stack;

public class Run {
	public static void main(String[] args) {
		// stack 
		Stack<Data> st = new Stack<Data>();
		
		// push()
		st.push(new Data(1));
		st.push(new Data(5));
		st.push(new Data(9));
		st.push(new Data(3));
		
		System.out.println(st);
		
		// peek()
		System.out.printf("st.peek() = %s\n", st.peek());

		// size()
		System.out.printf("st.size() = %s\n", st.size());
		
		// pop()
		System.out.printf("st.pop() = %s\n", st.pop());

		// size()
		System.out.printf("st.size() = %s\n", st.size());
		
		// search()
		System.out.printf("st.search(1) = %d\n", st.search(new Data(9)));
		System.out.printf("st.search(9) = %d\n", st.search(new Data(1)));
		System.out.printf("st.search(8) = %d\n", st.search(new Data(8)));

		//isEmpty()
		System.out.printf("st.isEmpty() = %b\n", st.isEmpty());

		
	}

}
