package ch05.array04;

import java.util.Scanner;

public class Resolve3 {
	public static void main(String[] args) {
		// 3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=7;i++) {
			System.out.println("학점을 입력하세요 >> ");
			int sum = sc.nextInt();
			int avg = sum/7;
		}
		
		System.out.println(sum);
		System.out.println(avg);
		
		sc.close();
	}

}
