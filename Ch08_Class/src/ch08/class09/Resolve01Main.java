package ch08.class09;

import java.util.Scanner;

//1. 중화 요리집을 임의대로 클래스로 만드세요


public class Resolve01Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Resolve01 rest = new Resolve01(sc, "홍굴이네 해물짬뽕", 
				new String[] {"해물짬뽕", "짬뽕", "짜장면", "찹살탕수육"});
		
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
	}

}
