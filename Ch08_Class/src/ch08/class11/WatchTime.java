package ch08.class11;

/*
 * 함수(메서드)의 오버로딩(Overloading)
 * Java는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러 개 만들 수 있다.
 * 실행할 때 매개변수의 종류에 따라 함수를 구별할 수 있기 때문에
 */

public class WatchTime {
	private int hour, min, sec; // 힙에 들어간다.(객체별로 따로 들어간다.)

	// public WatchTime(WatchTime this, int hour, int min, int sec)
	public WatchTime(int hour, int min, int sec) {
		System.out.println("this: " + this);
		this.hour = hour;
		this.min  = min;
		this.sec = sec;
	}
	// public void viewTime(WatchTime this)
	public void viewTime() {
		
		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
		
	}
		public static void main(String[] args) {
			WatchTime wtNum = new WatchTime(12,13,33); // 객체를 만들었다.(스택에 들어간다.)
			System.out.println("wtNum: " + wtNum);
			System.out.printf("wtNum:%x\n", wtNum.hashCode());
			wtNum.viewTime();		//viewTime(wtNum);
			
			WatchTime wtNum1 = new WatchTime(12,13,33); // 객체를 만들었다.
			System.out.println("wtNum1: " + wtNum1);
			System.out.printf("wtNum1:%x\n", wtNum1.hashCode());
			wtNum1.viewTime();		//viewTime(wtNum1);
	}

}


