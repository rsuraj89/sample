package com.test.pgm;

public class LongestPaliondrome 
{
	public static void main(String[] args) 
	{
		System.out.println(findLongestPalindromeInString("test"));
	}

	public static String findLongestPalindromeInString(String str) {

		// If string is null, return null.
		if (str == null)
			return null;

		// Initially 1st letter of string be the longestPalindrome.
		String longestPalindrome = String.valueOf(str.charAt(0));

		// Because of for loop - at runtime string will be of odd and even length
		for (int i = 0; i < str.length() - 1; i++) {

			// for handling string with ODD length at runtime
			String returnedPalindrome = findLongestPalindromeWithSpecifiedParameter(str, i, i);
			// if returnedPalindrome's length is larger than longestPalindrome,
			// assign returnedPalindrome to longestPalindrome.
			if (returnedPalindrome.length() > longestPalindrome.length()) {
				longestPalindrome = returnedPalindrome;
			}

			// for handling string with EVEN length at runtime
			returnedPalindrome = findLongestPalindromeWithSpecifiedParameter(str, i, i + 1);
			// if returnedPalindrome's length is larger than longestPalindrome,
			// assign returnedPalindrome to longestPalindrome.
			if (returnedPalindrome.length() > longestPalindrome.length()) {
				longestPalindrome = returnedPalindrome;
			}
		}
		// Finally when for loop completes, return longestPalindrome.
		return longestPalindrome;
	}

	static public String findLongestPalindromeWithSpecifiedParameter(String inputString, int left, int right) {
		if (left > right)
			return null;

		/*
		 * left will decrement and move towards start of string until it reaches start.
		 * right will increment and move towards end of string until it reaches end. And
		 * any left and right reaches destination (i.e. start and end respectively) at
		 * any point method will return.
		 */
		while (left >= 0 && right < inputString.length()
		/*
		 * proceed only if character at left and right are equal Example - String is
		 * "baab", left is 1 (i.e. a) and right is 2 (i.e. a) As left and right are
		 * equal we can proceed by entering while loop.
		 */
				&& inputString.charAt(left) == inputString.charAt(right)) {
			left--;
			right++;
		}
		/*
		 * return Example - String is "abcd", left is 1 (i.e. b) and right is 2 (i.e. c)
		 * As left and right are NOT equal return "abcd".substring(2, 2) = "" OR
		 * blankString
		 */
		return inputString.substring(left + 1, right);
	}

}