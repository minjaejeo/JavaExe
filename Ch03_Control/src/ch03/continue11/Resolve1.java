package ch03.continue11;

// for문 1~100까지 정수 중에 3의 배수의 총합 출력
public class Resolve1 {
	public static void main(String[] args) {
		int sum = 0;		// 스택에 들어간다.수명이 main함수에만 존재한다. 지역변수의 수명은 {}까지 존재.
		for(int i =1; i<=100;i++) {
			// int sum = 0;		// for문에 종속적이기때문에 for 문안에서 다시 0이 된다.
			if(i%3==0) {
				System.out.println(i + ", ");
				System.out.println("sum= " + sum);
				sum += i;
				System.out.println("sum= " + sum);
			}
		}
		System.out.println();
		
		System.out.println("1~100까지 정수 중에 3의 배수의 총합: " + sum);
	}

}
