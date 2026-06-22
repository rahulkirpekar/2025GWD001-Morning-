package basic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		// Array 2'd Declaration
		int a1[][]  = new int[3][3];
/*		int[][] a2  = new int[3][3];
		int [][]a3  = new int[3][3];
		int [][] a4 = new int[3][3];
		int []a5[]  = new int[3][3];
*/		
		System.out.println("a1.length : " +a1.length);// 3
		System.out.println("a1[0].length : " +a1[0].length);//3

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] :" );
				a1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] :" + a1[i][j]);
			}
		}
		System.out.println("--------------------------------------");
		
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.print(a1[i][j]+"\t");
			}
			System.out.println();
		}
	}
}