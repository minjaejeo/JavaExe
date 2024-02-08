package ch14.exception01.ch11.sec05;

public class ThrowsExample1 {
	public static void main(String[] args) {
		try {
			findClass();
			
		}catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
	// throws 는 부모쪽으로 모아서 던져주기 위해서 사용한다.
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}

}
