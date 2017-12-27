package com.test.pgm;

public class ArrayElementFinder 
{
	//Second highest element from array
	
	public static void main(String[] args) 
	{
		int input[] = {3,4,1,5,6};
		
		int highest = 0;
		int secondHighest = 0;
		
		for( int i : input )
		{
			if( i > highest )
			{
				secondHighest = highest;
				highest = i;
			}
		}
		System.out.println(secondHighest);
	}
	
	//Highest
	
	/*int input[] = {3,4,1,5,6};
	
	int highest = 0;
	
	for( int i : input )
	{
		if( i > highest )
		{
			highest = i;
		}
	}
	System.out.println(highest);*/
}