package polymorphism.runtimtime.task2;

import java.util.Scanner;

public class TestApp1 
{
										 // Upcasting
	public static void getProfileByPlace(Person person) 
	{
		person.getBehave();
		
		if(person instanceof School) 
		{
			// Downcasting
			School school = (School)person;// ClassCastException
			school.getExamResult();
		}
		else if(person instanceof Org) 
		{
			// Downcasting
			Org org = (Org)person;
			org.getSalary();
		}
		else if(person instanceof PublicPlace) 
		{
			// Downcasting
			PublicPlace pobj = (PublicPlace)person;
			pobj.getPublicEvent();
		}
		else if(person instanceof Home) 
		{
			// Downcasting
			Home home = (Home)person;
			home.getMovieOnTime();
		}
	}
/*
	public static void getProfileByPlace(School school) 
	{
		school.getBehave();
		school.getExamResult();
	}
	public static void getProfileByPlace(Org org) 
	{
		org.getBehave();
		org.getSalary();
	}
	public static void getProfileByPlace(PublicPlace pobj) 
	{
		pobj.getBehave();
		pobj.getPublicEvent();
	}
	public static void getProfileByPlace(Home home) 
	{
		home.getBehave();
		home.getMovieOnTime();
	}
*/	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For Home");
		int choice = sc.nextInt();
		
		switch(choice) 
		{
			case 1: School school = new School();
					getProfileByPlace(school);
					break;
			case 2: Org org = new Org();
					getProfileByPlace(org);
					break;
			
			case 3: PublicPlace pobj = new PublicPlace();
					getProfileByPlace(pobj);
					break;
					
			case 4: Home home = new Home();
					getProfileByPlace(home);
					break;
		}
	}
}
