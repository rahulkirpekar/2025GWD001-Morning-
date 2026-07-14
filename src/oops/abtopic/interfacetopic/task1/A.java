package oops.abtopic.interfacetopic.task1;

public interface A 
{
//	1. Data Members/Constant Variables(public static final)
	public static final int NO = 10;// public static final
	
//	2. Methods
//		1. Abstract Methods(public abstract)

	abstract void test1();// public abstract
	public abstract void test2();// public abstract
	public abstract void test3();// public abstract
				
//		2. Non-Abstract Methods(static,default,private)
	
	static void test4()
	{
		System.out.println("A : static Method test4()");
	}
	default void test5()
	{
		System.out.println("A : default Method test6()");
		test6();
	}	
	private void test6()
	{
		System.out.println("A : private Method test6()");
	}
}