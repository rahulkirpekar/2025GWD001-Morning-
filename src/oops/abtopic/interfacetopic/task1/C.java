package oops.abtopic.interfacetopic.task1;

public class C extends B
{
	@Override
	public void test3() 
	{
		System.out.println("C--test3()");
	}
	@Override
	void test7() 
	{
		System.out.println("C--test7()");
	}
	@Override
	void test8() 
	{
		System.out.println("C--test8()");
	}
	public static void main(String[] args) 
	{
		A obj1 = new C();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		
		A.test4();
		
		obj1.test5();
		
		if(obj1 instanceof C) 
		{
			C objC = (C)obj1;
			
			objC.test3();
			objC.test7();
			objC.test8();
		}
	}
}