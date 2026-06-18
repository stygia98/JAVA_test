package chapter17.page0131;

import java.util.Objects;

public class Data implements Comparable<Data> {
	private int number;

	public Data(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equalsCheck = false;
		Data data = (Data) obj;
		
		if(obj instanceof Data)
			if(this.number == data.number) 
				equalsCheck = true;
		
		return equalsCheck;
		
	
		
	}

	@Override
	public int compareTo(Data o) {
		return this.number - o.number;
	}

	@Override
	public String toString() {
		return "" + number + "";
	}
	
}
