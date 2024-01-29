package ch05.array08;

import java.util.Arrays;

/*
 * 정수 배열 5개를 할당하고
 * System.out.println(Arrays.toString(numArr));
 * 로 배열을 출력했을 때 거꾸로 출력되도록
 * 배열의 값을 거꾸로 저장하세요.
 */
public class Resolve3 {
	public static void main(String[] args) {
		int[] numArr = {10,20,30,40,50};
		int temp = 0;
		for (int i = numArr.length - 1; i >= 0; i--) {
			for (int j = 0; j < 2; j++) {
				temp = numArr[i];
				numArr[i] = numArr[j];
				numArr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(numArr));
		}
	}


