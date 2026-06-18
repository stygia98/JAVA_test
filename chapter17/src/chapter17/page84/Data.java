package chapter17.page84;

import java.util.Objects;

public class Data implements Comparable<Data> {
	private int age;
	
	public Data() {
		this(0);
	}
		
	public Data(int age) {
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
		
		Data data = (Data) obj;
		equalsFlag = (this.age == data.age) ? true : false; 
		
		return equalsFlag;
	}

	@Override
	public int compareTo(Data o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return "" + age + "";
	}
	
	
	
	
}
