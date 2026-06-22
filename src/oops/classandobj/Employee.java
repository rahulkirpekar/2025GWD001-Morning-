package oops.classandobj;

import java.util.Scanner;

// Increase DataSecurity
//     |
// Pure Encapsulation = [1. Dms(Private) + 2. Mf's(Public)]

public class Employee 
{
	private int empId;
	private String empName;
	private double empSalary;
	private String empDsgn;
	private String empOrgName;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		empName = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		empSalary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		empDsgn = sc.nextLine();
		System.out.println("Enter Employee OrgName : ");
		empOrgName = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(empId+" " + empName+" " + empSalary+" " + empDsgn+" " + empOrgName);
	}
}
