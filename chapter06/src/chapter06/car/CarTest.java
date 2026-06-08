package chapter06.car;

public class CarTest {
	static String[] colorArray = {"노랑색", "빨강색", "검정색"};
	static String[] nameArray = {"소렌토", "제네시스", "그렌저"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass[] carArray = new CarClass[3];
		
		for (int i = 0; i < carArray.length; i++) {
			carArray[i] = new CarClass(colorArray[i], 10000*(i+1), 2026, nameArray[i]);
		}
		
		
//		carArray[0].color = "파란색";
		carArray[0].setColor("회색");
		
		carArray[0].drive();
		carArray[1].drive();
		carArray[2].drive();
		
		
		System.out.printf("%s\n", carArray[0].toString());
		System.out.printf("%s\n", carArray[1]);
		System.out.printf("%s\n", carArray[2]);
		
//		carArray[0].carPrint();
//		carArray[1].carPrint();
//		carArray[2].carPrint();

		System.out.printf("첫번째 차색상은 %s\n", carArray[0].getColor());
		
	}

}
