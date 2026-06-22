package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// Array Declaration
		int a[] = new int[5];
		
		System.out.println(a.length);// size of int array--5

		for(int i = 0 ; i < a.length ; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length ; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}