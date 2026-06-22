package oops.inhtopic.constopic.supertopic.test1;

public class A 
{
	int no1;
	public A()
	{
		no1 = 100;
		System.out.println("A--Default Constructor");
	}
	public A(int no1)
	{
		System.out.println("A--ONE-ARG Para Constructor");
		this.no1 = no1;
	}
}
