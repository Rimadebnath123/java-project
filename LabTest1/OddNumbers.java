package LabTest1;

public class OddNumbers {

	public static void main(String[] args) {
		int n=20;
		//calling method
		oddNumbers(n);
	}
	//print the odd numbers using method
	public static void oddNumbers(int n)//called method
	{
		System.out.println("odd Numbers:");
		int i;
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}

	}

}
