package ch05.array08;

/*
 * 정수 배열 5개를 할당하고 
 * Arrays.sort를 사용하지 말고
 * 배열을 오름차순으로 정렬하도록 저장하세요.
 * 그리고 출력하세요.
 */

public class Resolve4 {
	public static void main(String[] args) {
		int[] numArr = {10,20,30,40,50};
		
		int min = numArr[0];
		int temp = 0;
		for(int i=1;i<numArr.length;i++) {
			if(min>numArr[i])
				temp = min;
				min = numArr[i];
				numArr[i] = temp;
			
		}
		System.out.println(Arrays.toString(numArr));
	}

}
