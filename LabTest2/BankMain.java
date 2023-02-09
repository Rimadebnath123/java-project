package LabTest2;

public class BankMain {
	public static void main(String[] args) {
		//Instantiated the class Bank 
		Bank a=new BankA();//a is instance or object of Bank A
		Bank b=new BankB();//b is instance or object of Bank B
		Bank c=new BankC();//c is instance or object of Bank C
		System.out.println("Bank A.."+a.getBalance());//print data
		System.out.println("Bank B.."+b.getBalance());
		System.out.println("Bank c.."+c.getBalance());
}
}