package day29jdbc;

public class JDBCUsingMultithreading {
public static void main(String[] args) throws InterruptedException {
	
	Thread tx=null;
	FirstBatch thread1=new FirstBatch();
	SecondBatch thread2=new SecondBatch();
	ThirdBatch thread3=new ThirdBatch();
	
	tx=new Thread(thread1);
	tx.start();
	tx.join();
	tx=new Thread(thread2);
	tx.start();
	tx.join();
	
	tx=new Thread(thread3);
	tx.start();
	
}
}
