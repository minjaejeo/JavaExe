package ch05.array04;

public class Resolve2 {
	// 2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
	public static void main(String[] args) {
		String[] names = new String[10];
		
		for(int i=10;i>names.length;i--) {
			System.out.println(names[i] + " ");
			
		}
		System.out.println();
	}
}
