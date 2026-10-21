package day17;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int arr[]= {8,2,3,7,4};   //data is not sorted
		//int search=7;		//found
		int search=17;      //not found
		int flag=0;
		for(int n:arr)			//n
		{						//8
			if(n==search)
			{
				System.out.println("Found");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Not Found");
		

	}

}
