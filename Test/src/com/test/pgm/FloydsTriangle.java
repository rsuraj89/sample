package com.test.pgm;

public class FloydsTriangle 
{
  /*1
	2	3
	4	5	6
	7	8	9	10
	11	12	13	14	15*/

	public static void main(String[] args) 
	{
		int rowCount = 5;
		int counter = 0;
		
		for( int i = 1 ; i<=rowCount ; i++ )
		{
			for( int j = 1 ; j<=i; j++ ) 
			{
				System.out.print(counter++ + " " );
			}
			System.out.println("");
		}
	}
}
