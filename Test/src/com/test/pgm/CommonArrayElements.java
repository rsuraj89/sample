package com.test.pgm;

public class CommonArrayElements 
{
	//Elements which are common in two arrays
	
	public static void main(String[] args) {
		
		int arr1 [] = {1,2,3,45,67,78};
		int arr2 [] = {6,4,5,1,67,44,32};
		
		for( int i = 0 ; i < arr1.length; i++ )
		{
			for( int j = 0 ;j <arr2.length; j++ )
			{
				if( arr1[i] == arr2[j] )
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
