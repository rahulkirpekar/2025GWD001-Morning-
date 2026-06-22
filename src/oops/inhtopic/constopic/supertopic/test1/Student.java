package oops.inhtopic.constopic.supertopic.test1;

public class Student extends Person
{
	int rno,std;
	
	public Student() 
	{
		rno = 0;
		name = "NULL";
		std = 0;
		System.out.println("Student : Default Constructor");
	}
	
	public Student(int rno, String name,int std) 
	{
		super(name);
		this.rno = rno;
		this.std = std;
		System.out.println("Student : PARA Constructor");
	}

	public void dispData() 
	{
		System.out.println(rno+" " + name +" " + std );
	}
	public static void main(String[] args) 
	{
		Student obj = new Student(1,"Ganesh",12);
		obj.dispData();
	}
}