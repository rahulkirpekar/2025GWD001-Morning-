package oops.inhtopic.hierarinh;

import java.util.Scanner;

// Hierarchical Inheritance

public class TechEmployee extends Employee
{
	String projectName;	

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
		System.out.println("Entter Employee ProjectName : ");
		projectName = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" "+ dsgn+" " + orgName+" " + projectName);
	}
}
