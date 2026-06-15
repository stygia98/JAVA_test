package chapter16.practice01;

public class Run {
	public static void main(String[] args) {
		//제너릭 클래스 생성과 사용
//=================================================================		
		Goods1 goods1 = new Goods1(new Apple());
		Apple apple = goods1.getApple();
		goods1.setApple(apple);
		
		Goods2 goods2 = new Goods2(new Pencil());
		Pencil pencil = goods2.getPencil();
		goods2.setPencil(pencil);
//=================================================================		
		
//		Object object1 = goods01.getObject();	
//		Apple apple2 = null;
//		if(good1.getObject() instanceof Apple) {
//			apple2 = (Apple)good1.getObject();
//		} else {
//			System.out.println("Goods 에는 Apple 객체가 없다");
//		}
		Good good1 = new Good(new Apple());
		Apple apple2 = (Apple)good1.getObject();
//		Pencil pencil3 = (Pencil)good1.getObject();
		good1.setObject(apple2);
		
		Good good2 = new Good(new Pencil());
		Pencil pencil2 = (Pencil)good2.getObject();
		good2.setObject(pencil2);
//=================================================================		
		MyClass<Apple> mc = new MyClass<Apple>( new Apple() );
		Apple apple3 = mc.getT();
		mc.setT(apple3);
//		Pencil pencil3 = mc.getT();
		
		MyClass<Pencil> mc2 = new MyClass<Pencil>( new Pencil() );
		Pencil pencil3 = mc2.getT();
		mc2.setT(pencil3);
//=================================================================		
		MyClass2<Apple, Pencil> mc3 = new MyClass2<Apple, Pencil>( new Apple(), new Pencil() );
		Apple apple4 = mc3.getT();
		Pencil pencil4 = mc3.getS();
		mc3.setT(apple4);
		mc3.setS(pencil4);
		
		
		
	}
	
}
