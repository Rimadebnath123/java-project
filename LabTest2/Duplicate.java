package LabTest2;

import java.util.Scanner;
public class Duplicate {
	public static void main(String[]args) {
		int n;
	try (Scanner scan = new Scanner(System.in)) {
		//Enter the word
		System.out.println("Enter the no of words:");
		n=scan.nextInt();
		String[]s=new String[n];
		//Enter the no of String
		System.out.println("Enter those strings:");
		
		for(int i=0;i<n;i++) {
			s[i]=scan.next();
		}
			for(int i=0;i<n;i++) 
			{
				for(int j=i+1;j<n;j++)
				{
					if(s[i].equals(s[j])&&(i!=j))
						//printing the duplicate value
						System.out.println("Duplicate value is:"+s[j]);
				}
			}
	}
	}
}