package chapter12.practice04;

public class ImageButton {
	//멤버 변수
	private OnDoubleClickListener odc;
		
	//인터페이스 설계(이벤트 처리방법)
	static interface OnDoubleClickListener {
		public abstract void onDoubleClick();
	}

	public void setOnDoubleClickListener(OnDoubleClickListener odc) {
		this.odc = odc;
	}
	
	public void DoubleClick() {
		this.odc.onDoubleClick();
	}
	
	

}
