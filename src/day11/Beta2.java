package day11;

public class Beta2 implements Runnable
{
@Override
public void run() {
	
	System.out.println("Thread name "+Thread.currentThread().getName());
	for(int i=1000;i<=2000;i++)
		System.out.println("\t" +i);
}
}
