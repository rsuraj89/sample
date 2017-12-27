package com.test.pgm;

public class StringReverse 
{
	public static String input = "Malayalam";
	
	public static void main(String[] args) 
	{
		char [] arr = input.toCharArray();
		
		String output = "";
		for( int i = arr.length-1 ; i >= 0 ; i-- )
		{
			output = output + arr[i];
		}
		
		System.out.println(output);
	}
}
