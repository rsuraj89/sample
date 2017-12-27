package com.test.pgm;

import java.util.Arrays;

public class AnagramChecker 
{
	//Two strings are called anagrams if they contain same set of characters but in different order.
	
	public static void main(String[] args) 
	{
		String input1 = "suraj";
		String input2 = "rajsu";
		
		if( input1.length() != input2.length() )
		{
			System.out.println("Not Anagram");
		}
		
		char [] char1 = input1.toCharArray();
		char [] char2 = input2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if( Arrays.equals(char1, char2))
		{
			System.out.println("Anagram");
		}
		else 
		{
			System.out.println("Not Anagram");
		}
	}
}