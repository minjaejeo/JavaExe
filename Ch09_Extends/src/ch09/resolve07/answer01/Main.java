package ch09.resolve07.answer01;

public class Main {
	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		add.setValue(100, 20);
		sub.setValue(100, 20);
		mul.setValue(100, 20);
		div.setValue(100, 20);
		
		System.out.println("add.calculate() : " + add.calculate());
		System.out.println("sub.calculate() : " + sub.calculate());
		System.out.println("mul.calculate() : " + mul.calculate());
		System.out.println("div.calculate() : " + div.calculate());
	}

}
