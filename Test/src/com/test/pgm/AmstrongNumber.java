package com.test.pgm;

public class AmstrongNumber 
{
	// Sample 153 = (1*1*1)+(5*5*5)+(3*3*3)

	public static void main(String[] args) 
	{
		int input = 153;
		
		boolean flag = true;
		int number = input;
		int lastDigit;
		int sum = 0;
		
		while (flag) {
			if (number % 10 == 0) {
				flag = false;
			}
			lastDigit = number % 10;
			number = number / 10;
			sum = sum + (lastDigit * lastDigit * lastDigit);
		}

		if (input == sum) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not Amstrong");
		}
	}
}