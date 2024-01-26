package ch03.for10;

public class Resolve10 {
	public static void main(String[] args) {
//		10. for문을 이용해서 1부터 10까지 합을 출력하세요
//		for (int i=1, sum=1; i<=10; i++,sum += i)
//			System.out.println(i + " : " + sum);
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
