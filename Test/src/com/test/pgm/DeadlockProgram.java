package com.test.pgm;

public class DeadlockProgram 
{
	public static void main(String[] args) 
	{
		test();
	}
	
	static void test()
	{
		System.out.println("test");
		test1();
	}
	
	static void test1()
	{
		System.out.println("test1");
		test();
	}
}
