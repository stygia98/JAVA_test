package chapter16.page19;

public class Run {

	public static void main(String[] args) {
//		D<Object> d1 = new D<Object>(new Object());
//		D<A> d2 = new D<A>(new A());
		D<B> d3 = new D<B>(new B());
		D<C> d4 = new D<C>(new C());
		
//		d3.setT(new Object());
//		d3.setT(new A());
		d3.setT(new B());
		d3.setT(new C());
		
		d4.setT(new C());
		
	}

}
