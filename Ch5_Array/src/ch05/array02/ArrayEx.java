package ch05.array02;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// int변수 공간 3개 만들어줘. 대표이름은 Kor
		// 배열은 메모리 내부에서 연속공간으로 할당된다. 
		int[] Kor = new int[3];
		/*
		 *  Kor[i] : i를 인덱스라고 지칭하고 
		 *  i는 0이 시작이고 마지막 인덱스는 항상 배열길이 -1과 같다.
		 */
		// 3명의 국어점수 입력
		for(int i=0;i<Kor.length;i++) {
			System.out.println((i+1) + "번째 학생 국어점수 입력 >> ");
			Kor[i] = sc.nextInt();
		}

		
		int total = 0;
		double avg = 0.;
		for(int i=0;i<Kor.length;i++) {
			total += Kor[i];
		}
		avg = total/Kor.length;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
		
		sc.close();
	}
}
