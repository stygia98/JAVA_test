package chapter17.page49;

import java.util.Objects;

public class Data implements Comparable<Data> {
	private int no;
	private String name;
		
	public Data() {
		this(0, null);
	}

	public Data(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + no + "," + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(no, name);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equalsCheck = false;
		
		if(obj instanceof Data) equalsCheck = true;
		
		Data data = (Data) obj;
		if((this.no == data.no) && this.name.equals(data.name)) equalsCheck = true;
		
		return equalsCheck;
	}

	@Override
	public int compareTo(Data o) {
		int result = name.compareTo(o.name);
		if(result == 0) 
			result = this.no - o.no;
		return result;
	}
	
	
	
}
