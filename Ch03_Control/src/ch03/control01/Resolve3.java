package ch03.control01;

import java.util.Scanner;

/*
 * while문과 Scanner의 nextLint() 메소드를 이용해서 다음 실행 결과와 같이 키보드로부터
 * 입력된 데이터로 예금,출금,조회,종료 기능을 제공하는 코드를 작성해보세요.
 */
public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 10000;
		int b = 2000;
		int c = 8000;
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		int i;
		while(i==4) {
			System.out.println("선택> ");
			int i = sc.nextInt();
			if (i==1)
			System.out.println("예금액> " + a);
		}
		sc.close();
	}

}
