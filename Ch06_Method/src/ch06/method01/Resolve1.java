package ch06.method01;

import java.util.Scanner;

/*
 * 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
 * 작은 값을 반환하는 메서드를 작성하고 사용하세요
 */

public class Resolve1 {
	public static int max(int num0, int num1) {
		int _max = 0;
		if(num0>num1) {
			_max = num0;
		}else {
			_max = num1;
		}
		return _max;
	}
	public static int min(int num0, int num1) {
		int _min = 0;
		if(num0<num1) {
			_min = num0;
		}else {
			_min = num1;
		}
		return _min;
	}
	public static void main(String[] args) {
		int num0 = 100, num1 = 200;
		int max = max(num0,num1);
		int min = min(num0,num1);
		System.out.printf("max는 %d min은 %d\n", max, min);
	}
}
