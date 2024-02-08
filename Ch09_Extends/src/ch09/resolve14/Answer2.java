package ch09.resolve14;

import java.util.Scanner;

import ch09.resolve14.question02.ITablet;
import ch09.resolve14.question02.factory01.LenovoTablet;
import ch09.resolve14.question02.factory01.LgTablet;
import ch09.resolve14.question02.factory01.SamsungTablet;
import ch09.resolve14.question02.order01.TabletTester;

public class Answer2 implements IQuestionAnswer{

	@Override
	public void question() {
		String question = "2. ITablet 인터페이스를 만드세요.\r\n"
				+ "   아래 메서드를 멤버로 추가하세요.\r\n"
				+ "   void movie();\r\n"
				+ "   void music();\r\n"
				+ "   void readBook();\r\n"
				+ "   \r\n"
				+ "   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고\r\n"
				+ "   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.\r\n"
				+ "   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.\r\n\r\n";
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		sc.nextLine();	// Enter치기 전까지 멈춰 있음
		
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] {
				new SamsungTablet(),
				new LgTablet(),
				new LenovoTablet()
		};
		int[] score = new int[tabletArr.length];
		
		
		
		sc.nextLine();	// Enter치기 전까지 멈춰 있음
	}

	@Override
	public boolean isRun() {
		return true;
	}

}
