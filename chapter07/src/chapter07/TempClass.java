package chapter07;

public class TempClass {
	//멤버변수
	int numA;
	int numB;
	int numC;
	int sum;
	float avr;
	
	//생성자
	public TempClass(int a, int b, int c) {
		this.numA = a;
		this.numB = b;
		this.numC = c;
	}
	
	//get set
	public int getA() {
		return numA;
	}

	public void setA(int a) {
		this.numA = a;
	}

	public int getB() {
		return numB;
	}

	public void setB(int b) {
		this.numB = b;
	}
	
	public int getC() {
		return numC;
	}

	public void setC(int c) {
		this.numC = c;
	}

	//기능
	public void calcSum() {
		sum = numA + numB + numC;
	}
	public void calcAvr() {
		this.avr = ((float)sum/3);
	}

	@Override
	public String toString() {
		return "TempClass [sum=" + sum + ", avr=" + avr + "]";
	}
	//출력
}
