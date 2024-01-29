package ch06.method01;

import java.util.Arrays;
import java.util.Scanner;

/*
 * gugudan(3);
 * 구구단 메서드를 void 리턴형으로 제작하세요.
 * 3을 입력하면 3단이 출력됩니다.
 */

public class Resolve4 {
	public static void gugudan(int num0) {
		for(int i=1;i<10;i++) {
			System.out.println(num0*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[10];
		
		System.out.println("1~9까지 정수를 입력하세요 >> ");
		int num0 = sc.nextInt();
		
		gugudan(num0);
		
		sc.close();
	}

	
}
