package ch15.thread01.ch14.sec06.exam02;

public class WorkObject {
	// 동기화 메서드
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		/*
		 * 아래 부분을 주석처리하면 ThreadA와 ThreadB가 제각각
		 * 동작하는 것을 볼 수 있다.
		 */
		//기다리는 다른 스레드는 wait에서 탈출하고 동작시작해
		notify();// 다른 스레드를 실행 대기 상태로 만듦
		try {
			// 내 스레드는 wait상태로 들어간다.
			wait();//자신의 스레드는 일시 정지 상태로 만듦
			
		}catch(InterruptedException e) {
			
		}
		
	}
	//동기화 메소드
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		/*
		 * 아래 부분을 주석처리하면 ThreadA와 ThreadB가 제각각
		 * 동작하는 것을 볼 수 있다.
		 */
		//기다리는 다른 스레드는 wait에서 탈출하고 동작시작해
		notify();// 다른 스레드를 실행 대기 상태로 만듦
		try {
			// 내 스레드는 wait상태로 들어간다.
			wait();//자신의 스레드는 일시 정지 상태로 만듦
			
		}catch(InterruptedException e) {
			
		}
	}

}
