package oops.constructortopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Kunal",12,100);
		Student s2 = new Student(s1);
		
		s1.dispData();
		s2.dispData();
	}
}
