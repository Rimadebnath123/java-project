package LabTest1;

public class Main {
	public static void main(String[] args) {
	//create an instance of person class
		Person p=new Person("Rima",22,"Barasat","765446797654");
		System.out.println("person....");
		p.display();//call the display function of person
		//create an instance of Employee class
		Employee E=new Employee(001,"Barasat",1000);
		E.displayEmployee();//call the display function of employee
	}
}
