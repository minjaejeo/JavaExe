package ch09.resolve07.answer02;

public class Main {
	public static void main(String[] args) {
		Triangle tri = new Triangle(4,5);
		System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이는 %d\n"
				, 4, 5, tri.area());
		
		tri.setBase(7);
		tri.setHeight(12);
		
		System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이는 %d\n"
				, 7, 12, tri.area());
	}

}
