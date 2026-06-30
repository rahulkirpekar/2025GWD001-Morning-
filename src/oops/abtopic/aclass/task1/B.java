package oops.abtopic.aclass.task1;

public abstract class B extends A
{
	@Override
	void test1() 
	{
		System.out.println("B : test1()");
	}
	@Override
	void test2() 
	{
		System.out.println("B : test2()");
	}
	
	public abstract void test6();
	public abstract void test7();
	
	
	void test5() 
	{
		System.out.println("B : test5()");
	}
}
