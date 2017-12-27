package com.test.pgm;

public class PrimeNumber 
{
	/*
	 * Prime number is a number that is greater than 1 and divided by 1 or itself.
	 * In other words, prime numbers can't be divided by other numbers than itself
	 * or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
	 */	
	public static void main(String[] args) 
	{
		int flag = 0;
		int input = 12;// it is the number to be checked
		
		if (input == 0 || input == 1) {
			System.out.println(input + " is not prime number");
		} 
		else 
		{
			for ( int i = 2; i < input; i++) {
				if (input % i == 0) {
					System.out.println(input + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(input + " is prime number");
			}
		}
	}
}
