package oops.classandobj;

import java.util.Scanner;

public class Student 
{
	//    object
	//      |
	// class Properties = [1. Data Members + 2.  Member Function]
	
	//To increase Data Security    
	//      |
	// Pure Encapsulation = [1. Dm's(Private) + 2. Mf's(public)]
	
	// 1. Data Members - Data
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	// 2. Constructors
	// 3. Member Function	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
}