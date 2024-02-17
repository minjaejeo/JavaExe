package ch16.lambda01.ch09.sec07.exam02;

public class Home {
	// 필드에 익명 구현 객체 대입(Class 이름은 컴파일러가 알아서 정해준다.)
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Tv를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다.");
		}
	};
	
	// 메소드(필드 이용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	public void use2() {
		// 로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드(매개 변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
