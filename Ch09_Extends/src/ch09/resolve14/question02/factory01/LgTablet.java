package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LgTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LgTablet - 영화화면이 미려하다~L");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LgTablet - 음질이 아주 좋구만~L");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LgTablet - 가동성이 좋구만~L");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

}
