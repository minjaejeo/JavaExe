package ch05.array07;

import java.util.Arrays;

/*
 * 배열의 정렬
 * Arrays.sort(scores);		데이터가 적을 때
 * Arrays.paralleSort(scores);데이터가 많을 때
 */

public class ArrayEx {
	public static void main(String[] args) {
		int[] scores = {98,12,52,93,33,54,21};
		System.out.println(Arrays.toString(scores));
		
		// 정렬
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
		}

	}
	

