package day11;

public class WashingMachine {

	public static void main(String[] args) throws Exception
	{
		Soak thread1=new Soak();
		Wash thread2=new Wash();
		Dry thread3=new Dry();
		
		thread1.start();
		thread1.join(6000);
		thread2.start();
		thread2.join(6000);
		thread3.start();

	}

}
