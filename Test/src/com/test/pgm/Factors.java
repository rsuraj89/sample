package com.test.pgm;

//The numbers that are completely divisible by the given number (it means the remainder should be 0) are called as factors of a given number.
public class Factors 
{
	public static void main(String[] args) 
	{
		int input  = 99 ;
		
		for( int i = 1 ; i<= input; i++ )
		{
			if( input % i == 0 )
			{
				System.out.println(i);
			}
		}
	}
}
