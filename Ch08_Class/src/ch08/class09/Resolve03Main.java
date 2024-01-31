package ch08.class09;

/*
 * 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
 * 클래스로 설계해서 프로그래밍 하세요
 */

public class Resolve03Main {
	public static void main(String[] args) {
		Resolve03 buyer = new Resolve03(5000);
		
		buyer.showBuyResult();
	}

}
