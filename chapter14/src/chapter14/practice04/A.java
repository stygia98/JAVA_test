package chapter14.practice04;

import java.util.Scanner;

public class A implements AutoCloseable{

	private String name;
	private Scanner scan;
	
	public A() {
		this(null);
	}

	public A(String name) {
		super();
		this.name = new String(name);
		this.scan = new Scanner(System.in);
	}

	public void setName() throws Exception {
		System.out.print("이릅 입력 : ");
		this.name = scan.nextLine();
	}

	public String getName() {
		return this.name;
	}


	@Override
	public void close() throws Exception {
		if (this.scan != null) this.scan.close();
		System.out.println("자동으로 scan 자원 반납");
	}
	

}
