package ch09.resolve07.answer04;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] b = new int[]	{5,9,7,3,11,12,15};
		int[] c = new int[] {20,21,22};
		
		int[] result = ArrayUtility2.concat(a, c);
		System.out.println(Arrays.toString(result));
		
		int[] result1 = ArrayUtility2.remove(a, b);
		System.out.println(Arrays.toString(result1));
	}

}
