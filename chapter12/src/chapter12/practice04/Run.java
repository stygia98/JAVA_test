package chapter12.practice04;

public class Run {

	public static void main(String[] args) {
		//내부 interface B 를 사용해보자
		//B b = new 자식();
		//B b2 = new B() {};
		
		A.B b = new A.B() {
			
			@Override
			public void bcd() {
				System.out.println("다형성 구현1");
			}
		};
		
		b.bcd();
		
		//==========================
		C c = new C();
		A.B b2 = c;
		b2.bcd();
		
		//이미지버튼을 이벤트 핸들러 등록 처리 진행
		ImageButton i_button = new ImageButton();
		i_button.setOnDoubleClickListener(new ImageButton.OnDoubleClickListener() {
			
			@Override
			public void onDoubleClick() {
				System.out.println("요청한 이미지 처리완료");
			}
		});
		
		i_button.DoubleClick();
	}

}
