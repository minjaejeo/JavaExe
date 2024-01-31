package ch08.class09;

/*
 * 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
 * 클래스로 설계해서 프로그래밍 하세요
 */

public class Resolve03 {
	private int money;
	private int numOfPear = 0;
	final int PEAR_PRICE = 2500;
	
	public Resolve03(int money) {
		this.money = money;
		this.numOfPear = 0;
	}

	public void buyPear(int money) {
		this.money -= money;
	}
	public void showBuyResult() {
		System.out.println("나는 마트에 가서" + money + 
				"원을 주고 배 가격" + PEAR_PRICE + "를 샀다.");
	}
	
}