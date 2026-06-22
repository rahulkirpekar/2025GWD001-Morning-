package polymorphism.runtimtime;

public class School extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("School - getBehave() - Student Behaviour");
	}
	
	public void getExamResult() 
	{
		System.out.println("School - getExamResult() - Student Exam Result");
	}
}
