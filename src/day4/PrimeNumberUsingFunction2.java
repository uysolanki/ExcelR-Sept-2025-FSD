//Display All Prime Numbers from Array
package day4;

public class PrimeNumberUsingFunction2 {

	public static void main(String[] args) {
	
		int arr[]= {23, 18, 25, 40, 29};
		
		System.out.println("Prime numbers from array are as follows");
		for(int i=0; i<arr.length;i++)
		{
				if(checkPrime(arr[i]))
						System.out.println(arr[i]);									//i		arr[i]			//num			//display
		}													//0		23				23				23
	}														//1		18				18
															//2		25
	public static boolean checkPrime(int num) {									
		int flag=0;															
		for(int j=2;j<=Math.sqrt(num);j++)						
		{
			if(num%j==0)
			{
				flag=1;
				break;
			}
		}
//		if(flag==0)
//		return true;
//		else
//		return false;
		
		return flag==0;
	}

}
