package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<String>();
		list.add(10); // Allowed ❌ (Raw type used)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
		
		for (int i = 1; i <=10; i++) 
		{
			System.out.println(no+" * " + i + " = " + (no*i));
		}
	}
}
