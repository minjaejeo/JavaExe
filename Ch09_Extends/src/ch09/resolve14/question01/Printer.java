package ch09.resolve14.question01;


public class Printer {
	protected String modelName;
	protected String menufacturer;
	protected P_INTERFACE pInterface;
	protected int printCount;
	protected int paperRemains;
	
	public Printer(String modelName, String menufacturer, P_INTERFACE pInterface, int printCount, int paperRemains) {
		this.modelName = modelName;
		this.menufacturer = menufacturer;
		this.pInterface = pInterface;
		this.printCount = printCount;
		this.paperRemains = paperRemains;
	}
	
	public void print() {
		this.paperRemains--;
	}


	
	
	
	

}
