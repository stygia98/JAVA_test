package test.singleton;

public class Run {
	public static void main(String[] args) {
		SingleTon st = SingleTon.getInstance();
		
		System.out.println("합계 : "+ st.sum(10));
	}
}
