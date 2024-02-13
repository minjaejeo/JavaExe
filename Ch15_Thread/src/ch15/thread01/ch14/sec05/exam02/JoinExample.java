package ch15.thread01.ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
//			Thread.sleep(100); //계산 중간에 끝나버린다.
		}catch(InterruptedException e) {
			
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}

}
