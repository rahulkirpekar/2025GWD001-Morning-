package oops.classandobj;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		Object Array
		
		Employee e[] = new Employee[5];
		
		System.out.println(e);
		
//		System.out.println("e[0] : " + e[0]);
//		System.out.println("e[1] : " + e[1]);
//		System.out.println("e[2] : " + e[2]);
//		System.out.println("e[3] : " + e[3]);
//		System.out.println("e[4] : " + e[4]);

		for (int i = 0; i < e.length; i++) 
		{
			e[i] = new Employee();
			e[i].scanData();
		}
		for (int i = 0; i < e.length; i++) 
		{
			e[i].dispData();
		}
		
		
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		Employee e3 = new Employee();
		
//		e1.scanData();
//		e2.scanData();
//		e3.scanData();
		
//		e1.dispData();
//		e2.dispData();
//		e3.dispData();
	}
}
