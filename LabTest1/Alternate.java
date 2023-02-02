package LabTest1;
public class Alternate {


		public static void main(String[] args) {
			//array declaration and initialization
			int arr[]= {1,2,3,4,5,6,7,8,9,10};
			System.out.println("The sum of alternative numbers are :"+alternate(arr));
			
		}
		
		public static int alternate(int arr1[])
		{
			int j=0,sum=0;
			int b[]=new int[arr1.length];//array declaration and memory allocation
			for(int i=0;i<arr1.length;i+=2)
			{
				b[j]=arr1[i];
				sum+=b[j];//calculate the sum of alternative array values
				j++;	
			}
			return sum;//return sum value from main
		}

	}

