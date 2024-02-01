package ch08.class09.answer01;

/*
 *  2. FruitMain클래스에 현재는 buyer.buyApple(seller, 2000);
 *  처럼 프로그래밍 되어 있습니다.
 *  아래처럼 seller를 중심으로 수정하세요.
 *  seller.saleApple(buyer, 2000);
 */

public class FruitSeller {
	private int numOfApple;			// 사과개수
	private int saleMoney;			// 판매금액
	final int APPLE_PRICE = 1000;	// 사과가격(상수(대문자)) 고정(안바뀐다.) 안전을 위해서
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public int saleApple(FruitBuyer buyer , int money) {
		int num = buyer.buyApple(money);
		numOfApple -= num;
		saleMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("***과일 판매자의 현재 상황***");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + saleMoney);
		
	}

	
}
