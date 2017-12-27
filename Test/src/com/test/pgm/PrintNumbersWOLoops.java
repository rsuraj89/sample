package com.test.pgm;

public class PrintNumbersWOLoops {
	static int counter;

	public static void main(String[] args) {
		counter = 10;
		test(1);
	}

	private static int test(int i) {
		if (i == counter + 1) {
			return 0;
		} else {
			System.out.println(i++);
			return test(i);
		}
	}
}
