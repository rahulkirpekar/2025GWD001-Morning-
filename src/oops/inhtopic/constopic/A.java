package oops.inhtopic.constopic;

public class A 
{
	int no1,no2,no3,no4;
	
	A()
	{
		System.out.println("A : Default Constructor");
		no1 = 0;
		no2 = 0;
		no3 = 0;
		no4 = 0;
	}
	A(int no1)
	{
		this();
		System.out.println("A : A(int no1) Constructor");
		this.no1 = no1;
	}
	A(int no1,int no2)
	{
		this(no1);
		System.out.println("A : A(int no1,int no2) Constructor");
		this.no2 = no2;
	}
	A(int no1,int no2,int no3)
	{
		this(no1, no2);
		System.out.println("A : A(int no1,int no2,int no3) Constructor");
		this.no3 = no3;
	}
	A(int no1,int no2,int no3,int no4)
	{
		this(no1,no2,no3);
		System.out.println("A : A(int no1,int no2,int no3,int no4) Constructor");
		this.no4 = no4;
	}
	public void dispData() 
	{
		System.out.println(no1 +" " + no2 +" " + no3 +" " + no4);
	}
}
