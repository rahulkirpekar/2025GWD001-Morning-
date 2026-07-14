package oops.abtopic.interfacetopic.task2;

public class Home implements Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("Home : getBehave()---Child");
	}
	public void getMovieOnTime() 
	{
		System.out.println("Home : Child -- Movie On Time");
	}
}
