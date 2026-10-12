package day11;

public class Alpha extends Thread //V V V Imp class
{
	@Override
	public void run() {
		for(int i=1;i<=1000;i++)
			System.out.println(i);
	}
	
//	@Override
//	public void start() {
//		System.out.println("Hi");
//	}
	
//	public void run(int n) {
//		for(int i=1;i<=1000;i++)
//			System.out.println(i);
//	}

}

//can we override the start method?
//Yes, but it is not recommended, bcoz my overidden start() will not perform the same tasks as the java.lang.Thread class's start()

//can we overload the run method?
//Yes, but it is not recommended, bcoz my start() will call the run() non parameterised 

//what is the diff between start() & run()
