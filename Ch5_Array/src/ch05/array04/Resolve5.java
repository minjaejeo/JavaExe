package ch05.array04;

import java.util.Scanner;

public class Resolve5 {
	/*
	 * 5. int배열을 10개 생성하세요.
 		사용자로부터 10개의 값을 입력받고
 		순서대로 출력하고  총합을 구하세요
	 */
	
	
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];
	
	for(int i=0; i<=num.length; i++) {
		System.out.println("값을 입력하세요 >> ");
		num[i] = sc.nextInt();
		System.out.println(num[i]);
	}
	
	sc.close();
	
}
