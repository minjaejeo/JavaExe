package ch06.method01;

import java.util.Scanner;

/*
 * 2개의 정수를 입력받고 큰 값을 반환하는 메서드와 
 * 작은 값을 반환하는 메서드를 작성하고 사용하세요
 */

public class Resolve1 {
	public static int calcArith(int num0, int num1) {
		int result = 0;
		
		if (num0>num1)
			result = num0;
		if(num0<num1)
			result = num1;
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 정수를 입력하세요 >> ");
		int num0 = sc.nextInt();
		System.out.println("2번째 정수를 입력하세요 >> ");
		int num1 = sc.nextInt();
		
		int result = calcArith(num0, num1);
		System.out.println(result);
		
		
		
	}
	// 교수님 풀이
//	public static int max(int num0, int num1) {
//		int max = 0;
//		if(num0>num1)
//			_max = num0;
//		else
//			_max = num1;
		
	}
	
}
