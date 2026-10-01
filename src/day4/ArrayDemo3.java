package day4;

public class ArrayDemo3 {

	public static void main(String[] args) {
	
		int arr[]= {23, 18, 25, 40, 29};
		
		// display all numbers from array
		System.out.println("Display all numbers from array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// display odd numbers from array
		System.out.println("\nDisplay ODD numbers from array ");
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 == 1)
				System.out.print(arr[i] + "\t");
		}

		// display sum of odd numbers from array
		System.out.println("\nDisplay ODD numbers from array ");
		int sum=0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 1)
				sum=sum+arr[i];
		}
		
		System.out.println("Sum of odd numbers is "+sum);
	}

}
