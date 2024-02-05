package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class SamsungTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("SamsungTablet - 영화화면이 깨끗하고 선명하다.~S");
		Thread.sleep((long)(Math.random()*500) + 500);

		
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("SamsungTablet - 음질이 너무 좋구만용~S");
		Thread.sleep((long)(Math.random()*500) + 500);

		
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("SamsungTablet - 책 읽기가 너무 편한걸~S");
		Thread.sleep((long)(Math.random()*500) + 500);

		
	}

}
