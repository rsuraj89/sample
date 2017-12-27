package com.test.pgm;

public class StringReverseRecursion 
{
	public String reverse(String str) 
	{
		if ((str == null) || (str.length() <= 1)) {
			return str;
		} else {
			return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
		}
	}

	/* Driver program to test above function */
	public static void main(String[] args) 
	{
		String str = "Geeks for Geeks";
		StringReverseRecursion obj = new StringReverseRecursion();
		String rev = obj.reverse(str);
		System.out.println(rev);
	}
}