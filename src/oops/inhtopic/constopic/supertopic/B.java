package oops.inhtopic.constopic.supertopic;

public class B extends A
{
	// Instance variable
	int no1;
	
	
	
	
	
	
	public void test1() 
	{
		// Local Variable
		int no1;
		no1 = 10;
		
		this.no1 = 20;
		
		super.no1 = 30;
		
		System.out.println("local varibale : " + no1);// 10
		System.out.println("Current class Dm's : " + this.no1);// 20
		System.out.println("Parent class Dm's : " + super.no1);// 30
	}
}
