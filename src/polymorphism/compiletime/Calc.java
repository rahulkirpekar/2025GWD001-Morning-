package polymorphism.compiletime;

// Compiletime Polymorphiam : Method Overloadding
//-----------------------------------------------
public class Calc 
{
	public void addFun(short no1,short no2) 
	{
		System.out.println("addFun(short no1,short no2) : " + (no1+no2));
	}
	public void addFun(double no1,double no2) 
	{
		System.out.println("addFun(double no1,double no2) : " + (no1+no2));
	}
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3) : " + (no1+no2+no3));
	}
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4) : " + (no1+no2+no3+no4));
	}

	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		
		obj.addFun(20, 10);
		
	}
}
/*
Method Overlodding:-
----------------------

	1. method argument count
	2. method argument Datatype
	3. Type Pramotion Rule


	boolean----X
	
	
				 byte
				  |
				short
				  |
char------------>int  
				  |
				long   
				  |
				float  
				  |
			   double


			





*/













