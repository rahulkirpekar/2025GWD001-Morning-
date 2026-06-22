package oops.classandobj;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Student --reference variable type
		// obj--reference variable
		// new - JVM--create object
		// Student --create Object
		Student obj1 = new Student();
		Student obj2 = new Student();
		Student obj3 = new Student();
		
					// oops.classandobj.Student@3feba861
		System.out.println("obj1 : " + obj1);// Object---.toString()
		System.out.println("obj1.toString() : " + obj1.toString());// Object---.toString()
		System.out.println("obj2.toString() : " + obj2.toString());// Object---.toString()
		System.out.println("obj3.toString() : " + obj3.toString());// Object---.toString()
		
		obj1.scanData();
		obj2.scanData();
		obj3.scanData();
		
		obj1.dispData();
		obj2.dispData();
		obj3.dispData();
	}
}
