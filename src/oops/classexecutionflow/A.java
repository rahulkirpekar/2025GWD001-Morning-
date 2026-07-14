package oops.classexecutionflow;

// Class Execution Flow
//-------------------------
public class A 
{
	// static block
	static 
	{
		System.out.println("Static Block---1...1");
	}
	static 
	{
		System.out.println("Static Block---2...2");
	}
	// static method
	static void test1() 
	{
		System.out.println("Static Method---test1()...4");
	}
	
	// Instance Block
	{
		System.out.println("Instance Block---1...5");
	}
	{
		System.out.println("Instance Block---2...6");
	}
	
	// Default Constructor
	A()
	{
		System.out.println("Default Constructor...7");
	}
	// Para Constructor
	A(int no)
	{
		this();
		System.out.println("Para Constructor..."+no+"...7");
	}
	
	// Nonstatic method
	void test2() 
	{
		System.out.println("Non-Static Method---test2()...8");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("===== START : Main Function ===== ...3");
		
		A.test1();
		
		A obj = new A(10);
		obj.test2();
		
		System.out.println("===== EXIT : Main Function ===== ...9");
	}
}