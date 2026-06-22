package oops.inhtopic.mlinh;

import java.util.Scanner;

public class SciStudent extends Student
{
	String subject;
	
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
		sc.nextLine();
		System.out.println("Enter Your Specialisation : ");
		subject = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(rno +" " + name +" " + std +" " + marks+" " + subject);
	}
}
