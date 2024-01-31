package ch08.class09;

import java.util.Scanner;

/*
 * Rectangle 클래스를 작성하세요
 * int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
 * void set(int x1, int y1, int x2, int y2) : 좌표 설정
 * int square()	: 사각형 넚이 리턴
 * void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
 * boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한
 * 좌표의 직사각형이면 true 리턴
 */

public class Resolve05 {
	private int[] x1 = new int[2];
	private int[] y1 = new int[2];
	private int[] x2 = new int[2];
	private int[] y2 = new int[2];
	
	private Scanner sc;
	
	public void set(int x1, int y1, int x2, int y2) {
		System.out.println("두점의 좌표를 입력하세요 >> ");
		for (i = 0; i < 2; i++) {
			x1[i] = sc.nextInt();
		}
		
		
	}

}
