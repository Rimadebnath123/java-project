package LabTest1;

public class Person {
//instance variables
	String name;
	int age;
	String address;
	String mobileno;
	
	////default constructor
	Person()
	{
		System.out.println("Default constructor of person..");  
	}
	//parameterized constructor
	Person(String name,int age,String address,String mobileno)
	{

		this.name=name;
		this.age=age;
		this.address= address;
		this.mobileno=mobileno;
	}
	// to display value
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Mobileno:"+mobileno);
	}
		
}
