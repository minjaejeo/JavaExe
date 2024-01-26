package ch05.array08;

import java.util.Arrays;

/*
 *  1. 정수 배열 5개를 할당하고 
 *  Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
 */
public class Resolve1 {
	public static void main(String[] args) {
		int[] scores = {22,36,75,45,28};
		System.out.println(Arrays.toString(scores));
		
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
	}

}
