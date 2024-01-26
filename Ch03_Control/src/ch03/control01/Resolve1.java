package ch03.control01;

// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의
// 총합을 출력하는 코드를 작성해보세요.
public class Resolve1 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int num;
			num=3*i;
			System.out.println(num);
			if (num>99)
				break;
			
		}
	}

}
