package oops.inhtopic.constopic.supertopic.test1;

public class B extends A
{
	int no2;
	
	public B()
	{
		no2 = 200;
		System.out.println("B--Default Constructor");
	}
	
	public B(int no1,int no2)
	{
		super(no2);
		System.out.println("B--ONE-ARG Para Constructor");
		this.no2 = no1;
	}
	
	public void dispData() 
	{
		System.out.println("No1 : " + no1 +"\nNo2 : " + no2);
	}
	
	public static void main(String[] args) 
	{
		B obj = new B(400,500);
		obj.dispData();
	}
}