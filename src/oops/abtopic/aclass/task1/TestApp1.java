package oops.abtopic.aclass.task1;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		B obj = new C();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		
		
		if(obj instanceof C ) 
		{
			// Downcasting
			C objC = (C)obj;
			objC.test3();
			objC.test6();
			objC.test7();
		}
		
	}
}
