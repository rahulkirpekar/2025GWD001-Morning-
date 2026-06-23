package polymorphism.runtimtime.task2;

public class Home extends Person
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
