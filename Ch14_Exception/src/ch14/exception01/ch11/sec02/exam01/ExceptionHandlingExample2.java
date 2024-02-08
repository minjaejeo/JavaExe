package ch14.exception01.ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		// 1) 로직 실행 영역
		try {
			int result = data.length()	;
			System.out.println("문자 수: "+result);
			
		}
		// 2) try 에서 발생한 예외를 받아서 처리하는 영역
		// 	   예외를 받아서 처리하는 영역
		catch(NullPointerException e) {
			System.out.println(e.getMessage());	// 원인만
//			System.out.println(e.toString());	// 예외만
//			e.printStackTrace();				// 어디서 에러났는지 알려줌
		}
		// 3) try 가 실행되었든, catch 가 실행되었든
		//		무조검 마무리로 실행되어야 하는 영역
		finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
