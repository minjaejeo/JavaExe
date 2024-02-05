package ch09.resolve07.answer05;

public class Main {
	public static void main(String[] args) {
		Child alex = new Child(15);
		Child james = new Child(7);
		
		alex.get(james, 2);
		james.get(alex, 7);
		
		System.out.println("alex의 구슬 수=" + alex.getBallCnt());
		System.out.println("james의 구슬 수=" + james.getBallCnt());
		
	}

	
	
}
