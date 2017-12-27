package com.test.pgm;

public class Duplicate {
	
	//Duplicate In a String & in a Number Array 
	
	public static void main(String[] args) 
	{
		String input  = "tester";
		
		char [] arr = input.toCharArray();
		
		for( int i = 0 ; i< arr.length; i++ )
		{
			for( int j = i + 1 ; j< arr.length; j++ )
			{
				if( arr[i] == arr[j] )
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}