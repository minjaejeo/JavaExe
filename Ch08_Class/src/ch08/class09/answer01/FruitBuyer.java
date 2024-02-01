package ch08.class09.answer01;

/*
 *  2. FruitMain클래스에 현재는 buyer.buyApple(seller, 2000);
 *  처럼 프로그래밍 되어 있습니다.
 *  아래처럼 seller를 중심으로 수정하세요.
 *  seller.saleApple(buyer, 2000);
 */

public class FruitBuyer {
	private int money;
	private int numOfApple;
	final int APPLE_PRICE = 1000;	// 사과가격(상수(대문자)) 고정(안바뀐다.) 안전을 위해서
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
		
	}
	public int buyApple(int money) {
		int num = money/APPLE_PRICE;
		this.numOfApple += num;
		this.money -= money;
		return num;
	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " +  numOfApple);
	}

}
