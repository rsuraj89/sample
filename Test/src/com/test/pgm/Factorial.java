package com.test.pgm;

public class Factorial 
{
	//5! = 5*4*3*2*1 = 120 
	public static void main(String[] args) 
	{
		int input = 5;
		
		int factorial = 1;
		for( int i = 1 ; i < input + 1 ; i++ )
		{
			factorial = factorial * i;
		}
		
		System.out.println(factorial);
	}
}
