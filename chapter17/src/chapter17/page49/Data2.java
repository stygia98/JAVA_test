package chapter17.page49;

import java.util.Objects;

public class Data2 implements Comparable<Data2> {
	private int age;
	
	public Data2() {
		this(0);
	}
		
	public Data2(int age) {
		super();
		this.age = age;
	}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equalsFlag = false;
		if (obj instanceof Data) equalsFlag = true;
		
		Data2 data = (Data2) obj;
		equalsFlag = (this.age == data.age) ? true : false; 
		
		return equalsFlag;
	}

	@Override
	public int compareTo(Data2 o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return "" + age + "";
	}
	
	
	
	
}
