package com.test.pgm;

public class SwapNumbers 
{

	public static void main(String[] args) 
	{
		int a, b, c;
		a = 10;
		b = 20;
		c = a;
		a = b;
		b = c;
		System.out.println("Values in a:" + a);
		System.out.println("Values in b:" + b);
	}

	static void withOutThirdVariable() 
	{
		int x = 10;
		int y = 20;
		System.out.println("Before swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}

}
