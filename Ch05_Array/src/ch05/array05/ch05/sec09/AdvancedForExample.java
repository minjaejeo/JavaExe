package ch05.array05.ch05.sec09;

import java.util.Arrays;

public class AdvancedForExample {
	public static void main(String[] args) {
		// 배열의 얕은 복사/깊은 복사
		// 얕은 복사
		int[] scores = {100,88, 95, 67, 75};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println(scores);
		System.out.println(scores1);
		System.out.println(scores2);
		
		// 깊은 복사 (힙에 별도의 공간을 생성한 후 scores4는 
		//			새로 생성한 공간을 가리키게 된다.)
		// ; 기존 공간과 분리되는 공간이다. 
		int[] scores4 = Arrays.copyOf(scores1, scores1.length);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores4));
		System.out.println();
		
		scores[2] = 1111111;
		System.out.println(Arrays.toString(socres));
		System.out.println(Arrays.toString(socres1));
		System.out.println(Arrays.toString(socres2));
		System.out.println(Arrays.toString(socres4));
		
		
		
	}

}
