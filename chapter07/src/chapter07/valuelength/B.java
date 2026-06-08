package chapter07.valuelength;

public class B {
	@SuppressWarnings("unused")
	private int a; int b; int c; int d;

//	public B() {
//		this(0);
////		a = 0;		b = 0;		c = 0;		d = 0;
//	}
//	public B(int a) {
//		this(a, 0);
////		this.a = a;		b = 0;		c = 0;		d = 0;
//	}
//	public B(int a, int b) {
//		this(a, b, 0);
////		this.a = a;		this.b = b;		c = 0;		d = 0;
//	}
//	public B(int a, int b, int c) {
//		this(a, b, c, 0);
////		this.a = a;		this.b = b;		this.c = c;		d = 0;
//	}
//	public B(int a, int b, int c, int d) {
//		this.a = a;		this.b = b;		this.c = c;		this.d = d;
//	}
	
	
	public B() {
		this(0, 0, 0, 0);
//		a = 0;		b = 0;		c = 0;		d = 0;
	}
	public B(int a) {
		this(a, 0, 0, 0);
//		this.a = a;		b = 0;		c = 0;		d = 0;
	}
	public B(int a, int b) {
		this(a, b, 0, 0);
//		this.a = a;		this.b = b;		c = 0;		d = 0;
	}
	public B(int a, int b, int c) {
		this(a, b, c, 0);
//		this.a = a;		this.b = b;		this.c = c;		d = 0;
	}
	public B(int a, int b, int c, int d) {
		this.a = a;		this.b = b;		this.c = c;		this.d = d;
	}
}
