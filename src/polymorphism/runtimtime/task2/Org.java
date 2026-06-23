package polymorphism.runtimtime.task2;

public class Org extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Org : getBehave()---Employee");
	}
	public void getSalary() 
	{
		System.out.println("Org : Employee -- Salary");
	}
}
