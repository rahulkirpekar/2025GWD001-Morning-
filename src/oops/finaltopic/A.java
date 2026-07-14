package oops.finaltopic;

public class A 
{
	final int no ;//= 300;
	
	A()
	{
		no = 211;
	}
	A(int no)
	{
		this.no = no;
	}
	
	
	public static void main(String[] args) 
	{
		A obj = new A(999);
		
//		obj.no = 100;
		System.out.println("obj.no : " + obj.no);


//		obj.no = 200;
//		System.out.println("Updated obj.no : " + obj.no);

		// Local Variable
//		final int no = 10;
		
//		System.out.println("No : " + no);

//		no = 10;
//		System.out.println("Updated No : " + no);
	}
}
