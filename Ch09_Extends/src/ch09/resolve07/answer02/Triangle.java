package ch09.resolve07.answer02;

public class Triangle {
	int base;
	int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	public int area() {
		return base*height/2;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
