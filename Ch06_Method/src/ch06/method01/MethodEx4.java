package ch06.method01;

import java.util.Scanner;

// 매서드를 만들기 전 코드
public class MethodEx4 {
	// main 메서드 내의 계산하는 부분을 옮긴다.
	public static int calcArith(int num0 ,int num1, String op) {
		int result = 0;		// 결과값 저장 변수
		
		// 2) 계산을 하는 부분
		switch(op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		}
		// 이 함수를 호출한 곳으로 이 값을 가지고 돌아간
		return result;
	}
	public static void viewResult(int result) {
		// 3) 결과값 출력
		System.out.printf("result의 값은 %d\n" , result);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.println("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("연산자 입력(+ - * / %) >> ");
		String op = sc.next();
		
		int result = calcArith(num0, num1, op);
		viewResult(result);
		
		sc.close();
	}
}
