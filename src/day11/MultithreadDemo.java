package day11;

public class MultithreadDemo {

	public static void main(String[] args) {
		Alpha thread1=new Alpha();
		Beta thread2=new Beta();
		
		thread1.start();
		thread2.start();

	}

}
