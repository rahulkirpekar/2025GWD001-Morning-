package oops.inhtopic.constopic.supertopic.test1;

public class Person 
{
	String name;

	public Person() 
	{
		System.out.println("Person : Default Constructor");
	}

	public Person(String name) 
	{
		this.name = name;
		System.out.println("Person : Para Constructor");
	}
}
