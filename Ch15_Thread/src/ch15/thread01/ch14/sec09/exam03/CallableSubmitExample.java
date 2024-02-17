package ch15.thread01.ch14.sec09.exam03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
	public static void main(String[] args) {
		//ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		//계산 작업 생성 및 처리 요청
		for(int i=1;i<=100;i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>()	{
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i=1;i<=idx;i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					// 어떤 스레드가 계산 처리를 했는지 알 수 있도록 출력
					System.out.println("[" + thread.getName() + "] 1~" + idx + " 합 계산");
					// 작업처리 결과 리턴
					return sum;
				}
			});
			try {
				// 스레드풀내의 임의의 스레드가 call()을 처리하고 난 결과를 아래처럼 받는다.
				int result = future.get(); // Callable의 call()메서드가 리턴한 값 얻기
				System.out.println("\t리턴값: " + result);
			}catch(Exception e)	{
				e.printStackTrace();
			}
		}
		
		//ExecutorService 종료
		executorService.shutdown();
	}

}
