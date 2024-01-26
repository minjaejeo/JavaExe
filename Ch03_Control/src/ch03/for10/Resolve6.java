package ch03.for10;

public class Resolve6 {
	public static void main(String[] args) {
//		6. do~while문을 이용해서 1부터 10까지 합을 출력하세요
		int i = 1, sum = 1; 
		do {
			System.out.println(i + ", " + sum);
			i++;
			sum = sum + i;
			
		}while(i<=10);
	}

}
