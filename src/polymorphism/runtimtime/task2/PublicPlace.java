package polymorphism.runtimtime.task2;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace : getBehave()---Citizen");
	}
	public void getPublicEvent() 
	{
		System.out.println("PublicPlace : Citizen -- Public Event");
	}
}
