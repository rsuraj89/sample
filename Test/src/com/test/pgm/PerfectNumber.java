package com.test.pgm;

public class PerfectNumber 
{
	/*
	 * Any number can be a Perfect Number, If the sum of its positive divisors
	 * excluding the number itself is equal to that number. For example, 28 is a
	 * perfect number because 28 is divisible by 1, 2, 4, 7, 14 and 28 and the sum
	 * of these values are: 1 + 2 + 4 + 7 + 14 = 28 (Remember, we have to exclude
	 * the number itself. That’s why we haven’t added 28 here). Some of the perfect
	 * numbers are 6, 28, 496, 8128 and 33550336 so on.
	 */
	
	public static void main(String[] args) 
	{
		int input = 28;
		int Sum = 0 ;
 
		for( int i = 1 ; i < input ; i++) 
		{
			if(input % i == 0)  
			{
				Sum = Sum + i;
			}
		}
		
		if (Sum == input) {
			System.out.format("\n% d is a Perfect Number", input);
		}
		else 
		{
			System.out.format("\n% d is NOT a Perfect Number", input);
		}
	}
}