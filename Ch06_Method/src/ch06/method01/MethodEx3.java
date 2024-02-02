package ch06.method01;

import java.util.Scanner;

// 매서드를 만들기 전 코드
public class MethodEx3 {
	// num0과 num1은 add함수의 지역변수이다. main함수의 num0과 num1과 다른 변수이다.
	 public static int add(int num0, int num1) {
		 int result = num0 + num1;
		 return result;	// 네가 원래 호출된 곳으로 값을 가지고 돌아가라.
	 }
	 public static void main(String[] args) {
		int result = add(11, 5);
		System.out.println("result의 결과값: "+ result);
		
		// main함수의 지역변수로 Stack에 num0과 num1이 초기화되어 생성된다.
		int num0 = 10, num1 = 5;	// add(int num0 = main:num0, int num1 = main:num1)
		int result1 = add(num0,num1);	// main의 result와 add의 result도 다른 거다.
		System.out.printf("result1의 결과값은 %d\n", result1);
		
		int a = 3, b = 7;
		int result2 = add(a,b);
		System.out.printf("result2의 결과값은 %d\n", result2);
	}
}
