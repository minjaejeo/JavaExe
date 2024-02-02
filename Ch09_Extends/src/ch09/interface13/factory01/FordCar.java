package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class FordCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("FordCar - It starts well.~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void turnOff()throws InterruptedException {
		System.out.println("FordCar - The engine turns off well.~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("FordCar - The accelerator accelerates well.~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("FordCar - The brakes work well.~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
