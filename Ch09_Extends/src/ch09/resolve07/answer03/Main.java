package ch09.resolve07.answer03;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] intArr = new int[] {31,11,9,99,2};
		double[] dArr = ArrayUtility.IntToDuoble(intArr);
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(dArr));
		
		double[] dArr1 = new double[] {2.1,3.4,5.5,7.9,1.2};
		int[] intArr1 = ArrayUtility.DoubleToInt(dArr1);
		System.out.println(Arrays.toString(dArr1));
		System.out.println(Arrays.toString(intArr1));
	}


}
