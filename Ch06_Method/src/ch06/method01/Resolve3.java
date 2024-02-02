package ch06.method01;

import java.util.Scanner;

/*
 * 3. int result = total(10, 100);
 * 위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야합니다.
 * total메서드를 작성하고 사용해보세요.
 */
public class Resolve3 {
	public static int total(int num0,int num1) {
		int sum = 0;
		for(int i=num0;i<=num1;i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num0 = 10, num1 = 100;
		int result = total(num0, num1);
		System.out.printf("누적합은 %d\n", result);
		
		int a=1,b=10;
		int result1 = total(a,b);
		System.out.printf("누적합은 %d\n", result1);
	}
}
