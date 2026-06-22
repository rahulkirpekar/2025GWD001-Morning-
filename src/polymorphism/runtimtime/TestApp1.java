package polymorphism.runtimtime;

import java.util.Scanner;

public class TestApp1 
{
											// Upcasting
	public static void getProfileBasedPlace(Person person) 
	{
		person.getBehave();
		
		if(person instanceof School) 
		{
			// Downcasting
			School student = (School)person;
			student.getExamResult();
		}
		else if(person instanceof Org) 
		{
			// Downcasting
			Org emp = (Org)person;
			emp.getSalary();
		}
		else if(person instanceof PublicPlace) 
		{
			// Downcasting
			PublicPlace citizen = (PublicPlace)person;
			citizen.getPublicEvent();
		}
		else if(person instanceof Home) 
		{
			// Downcasting
			Home child = (Home)person;
			child.getMoviewOnTime();
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter place : ");
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For Home");
		int choice = sc.nextInt();
		
		Person person = null;
		
		switch (choice) 
		{
					// Runtime Polymorphism
					// Polymorphism Object = (Parent reference = Child Object) 
			case 1: person =  new School();
					getProfileBasedPlace(person);
					break;
					
			case 2: person =  new Org();
					getProfileBasedPlace(person);
					break;
					
			case 3: person =  new PublicPlace();
					getProfileBasedPlace(person);
					break;
					
			case 4: person =  new Home();
					getProfileBasedPlace(person);
					break;
		}
	}
}