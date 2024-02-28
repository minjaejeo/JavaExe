package ch15.thread01.ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		// Worker 스레드 생성 후 -> start() -> run() 실행
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();// 비프음 발생
					try {
						Thread.sleep(500);//0.5초간 일시 정지
					}catch(Exception e) {
						
					}
					
				}
				
			}
		});
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);//0.5초간 일시 정지
			}catch(Exception e) {
				
			}
		}
	}
}
