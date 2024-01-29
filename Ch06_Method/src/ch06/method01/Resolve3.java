package ch06.method01;

import java.util.Scanner;

/*
 * int result = total(10,100);
 * 위처럼 사용하면 result에는 10부터 100까지의 누적합니 저장되어야 합니다.
 * total메서드를 작성하고 사용해보세요.
 */

public class Resolve3 {
	public static int total(int num0, int num1) {
		int sum = 0;
		for (int i = num0;i<=num1;i++)
			sum += i;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번째 숫자를 입력하세요 >> ");
		int num0 = sc.nextInt();
		System.out.println("2번째 숫자를 입력하세요 >> ");
		int num1 = sc.nextInt();
		
		int result = total(num0, num1);
		System.out.println(result);
				
		
		sc.close();
	}

}
