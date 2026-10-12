package day11;

public class MultithreadDemo {

	public static void main(String[] args) {
		Alpha thread1=new Alpha();
		Beta thread2=new Beta();
		
		thread1.start();   //will be considered as a normal function call
		thread2.start();
				
//		Alpha2 thread3=new Alpha2();
//		Beta2 thread4=new Beta2();
//		
//		Thread tx=null;
//		tx=new Thread(thread3,"tom");
//		tx.start();   //it call the run() method
//		
//		tx=new Thread(thread4,"jerry");
//		tx.start();

	}

}
