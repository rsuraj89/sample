package com.test.pgm;

public class CountNumberOfVowels 
{
	public static void main(String[] args) 
	{
		String input = "SachinTendulkar";
		int count = 0;
		for( int i = 0 ; i< input.length() ; i++ )
		{
			if( input.charAt(i) == 'a' || input.charAt(i) == 'b' 
					|| input.charAt(i) == 'c' || input.charAt(i) == 'd'
					|| input.charAt(i) == 'e' )
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
