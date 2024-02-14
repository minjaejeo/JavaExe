package ch16.lambda02.ch16.sec02.exam02;

public class Button {
	//정적 멤버 인터페이스 (함수형 인터페이스)
	@FunctionalInterface
	public static interface ClickListener{
		// 추상메서드
		void onClick();
	}
	//필드
	private ClickListener clickListener;
	
	//메서드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}

}
