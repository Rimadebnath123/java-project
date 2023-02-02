package LabTest1;
public class Employee extends Person {
		//instance variables
		int e_id;
		String dept;
		int salary;
		//default constructor
		Employee()
		{
			System.out.println("Default constructor of Employee..");  
		}
		//parameterized constructor
		Employee(int e_id,String dept,int salary)
		{
			this.e_id=e_id;
			this.dept=dept;
			this.salary=salary;	
		}
		//to display value
		public void displayEmployee()
		{
			System.out.println("e_id:"+e_id);
			System.out.println("Department:"+dept);
			System.out.println("salary:"+salary);
			
		}


	}
