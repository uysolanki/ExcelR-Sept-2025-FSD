package day11;

public class SingleThreadDemo {

	public static void main(String[] args)		// the main thread is the single thread
	{
		//display 1 to 1000
		//display 1001 to 2000
		System.out.println("Thread name "+Thread.currentThread().getName());
		for(int i=1001;i<=2000;i++)
		{
			System.out.println("\t"+i);
		}
		
		for(int i=1;i<=1000;i++)
		{
			System.out.println(i);
		}
		
		
		

	}

}
