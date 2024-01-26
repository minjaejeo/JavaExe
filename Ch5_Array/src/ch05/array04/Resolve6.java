package ch05.array04;

import java.util.Scanner;

public class Resolve6 {
	public static void main(String[] args) {
		/*
		 * 6. 5명의 학생의 이름과 점수를 입력받고
   			해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
  			A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
		 */
		Scanner sc = new Scanner(System.in);
		
		String[] stu = new String[5];
		int[] sco = new int[5];
		for(int i=1;i<=5;i++) {
			
			System.out.println("이름을 입력하세요 >> ");
			stu[i] = sc.nextInt();
			System.out.println("학점을 입력하세요 >> ");
			sco[i] = sc.nextInt();
		}
		sc.close();
	}

}
