package ch15.thread01.ch14.sec07.exam03;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			
		}
		thread.interrupt();
	}
}
