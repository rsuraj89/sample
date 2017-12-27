package com.test.pgm;

public class FibbinociSeries {
	/*
	 * The Fibonacci sequence is a series of numbers where a number is found by
	 * adding up the two numbers before it. Starting with 0 and 1, the sequence goes
	 * 0,1,1,2,3,5,8,13,21,34, and so forth.Written as a rule, the expression is
	 * xn=xn-1+xn-2.
	 */
	
	public static void main(String[] args) 
	{	
		int input  = 20;	
		int a,b,c;
        a=0;
        b=1;
        c=2;
        for(int i=1; i<=input; i++)
        {
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;        
        }	
	}
}
