package ch05.array08;

import java.util.Arrays;

/*
 * 2. 정수 배열 10개를 할당하고
 * Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요
 */

public class Resolve2 {
	public static void main(String[] args) {
		int[] numArr = {10, 99, 2, 78, 32, 1, 67, 105, 187, 23};
		
		int max,min;
		min = max = numArr[0];
		
		for(int i=1;i<numArr.length;i++) {
			if(min>numArr[i])
				min = numArr[i];
			if(max<numArr[i])
				max = numArr[i];
			
		}
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
		
	}

}
