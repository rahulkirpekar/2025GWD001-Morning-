package oops.constructortopic;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	// Default Constructor
	public Student()
	{
		System.out.println("=====START : Default Constructor====");
		
		rno = 0;
		name = "NONAME";
		std = 0;
		marks = 0;

		System.out.println("=====EXIT : Default Constructor====");
	}
	
	// Parameterized Constrctor
	public Student(int rno ,String name) 
	{
		this();
		System.out.println("=====START : PARA--Two Constructor====");
		this.rno = rno;
		this.name = name;
		System.out.println("=====EXIT : PARA--Two Constructor====");
	}
	
	// Parameterized Constrctor
	public Student(int rno ,String name,int std) 
	{
		this(rno, name);
		System.out.println("=====START : PARA--Three Constructor====");
		this.std = std;
		System.out.println("=====EXIT : PARA--Three Constructor====");
	}
	
	// Parameterized Constrctor
	public Student(int rno ,String name,int std,int marks) 
	{
		this(rno,name,std);
		System.out.println("=====START : PARA--Four Constructor====");
		this.marks = marks;
		System.out.println("=====EXIT : PARA--Four Constructor====");
	}
	
	// Para--Copy Constructor
	public Student(Student s)
	{
		System.out.println("=====START : Copy Constructor====");
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		this.marks = s.marks;
		System.out.println("=====EXIT : Copy Constructor====");
	}
	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std + " " + marks+"==="+this);
	}
}