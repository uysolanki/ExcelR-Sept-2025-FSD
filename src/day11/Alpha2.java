package day11;

public class Alpha2 implements Runnable
{
	@Override
	public void run() {
		
		System.out.println("Thread name "+Thread.currentThread().getName());
		for(int i=1;i<=1000;i++)
			System.out.println(i);
	}

}
