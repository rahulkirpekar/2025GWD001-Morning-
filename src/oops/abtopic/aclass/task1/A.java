package oops.abtopic.aclass.task1;

public abstract class A 
{
//	1.Dm's
	int no1;
	
//	2.constructor
	public A()
	{
		System.out.println("A : Default Constructor");
	}
	
//	3.Methods
//		1. Abstract Methods(Rules/GuideLine)
		abstract void test1();		
		abstract void test2();		
		abstract void test3();		

//		2. Non-Abstract Methods
		void test4()
		{
			System.out.println("A : test4()");
		}
}
