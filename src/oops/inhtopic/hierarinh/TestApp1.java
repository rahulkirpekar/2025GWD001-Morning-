package oops.inhtopic.hierarinh;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee();
		techEmp.scanData();
		techEmp.dispData();
		
		ManagementEmployee managementEmp = new ManagementEmployee();
		managementEmp.scanData();
		managementEmp.dispData();
	}
}
