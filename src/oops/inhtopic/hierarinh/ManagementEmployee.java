package oops.inhtopic.hierarinh;

import java.util.Scanner;

//Hierarchical Inheritance

public class ManagementEmployee extends Employee
{
	String managementTask;
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entter Employee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Entter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Entter Employee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Entter Employee Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Entter Employee OrgName : ");
		orgName = sc.nextLine();
		System.out.println("Entter Employee Management Task : ");
		managementTask = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" "+ dsgn+" " + orgName+" " + managementTask);
	}
}