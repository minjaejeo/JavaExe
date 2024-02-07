package ch09.resolve14.question01;

public class LaserPrinter extends Printer {
	
	protected double tonnerRemianders;

	public LaserPrinter(String modelName, String manufacture, P_INTERFACE pInterface, int printCount,
			int paperRemains, double tonnerRemainders) {
		super(modelName, manufacture, pInterface, printCount, paperRemains);
		this.tonnerRemianders = tonnerRemainders;
	}

	@Override
	public void print() {
		super.print();
		this.printCount++;
		this.tonnerRemianders *= 0.99;
		System.out.println("빠르게 출력된다.");
		System.out.println("품질이 매우 양호하다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [tonnerRemianders=" + tonnerRemianders + ", modelName=" + modelName + ", manufacture="
				+ manufacture + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}
	

}
