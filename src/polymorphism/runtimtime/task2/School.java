package polymorphism.runtimtime.task2;

public class School extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("School : getBehave()---Student");
	}
	public void getExamResult() 
	{
		System.out.println("School : Student -- Exam Result");
	}
}
