package polymorphism.runtimtime.task1;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		A objA = new A();
//		objA.test1();
	
		
//		objA = new B();
//		objA.test1();
//		
//		objA = new C();
//		objA.test1();
		
		// Upcasting
		A objA = new B();
		
		objA.test1();
		
		if(objA instanceof B) 
		{
			// Downcasting
			B objB = (B)objA;
			objB.testB();
			
		}
		else if(objA instanceof C) 
		{
			// Downcasting
			C objC = (C)objA;
			objC.testC();
		}
	}
}
