package day11;

public class SleepDemo {

	public static void main(String[] args) {
		Display thread1=new Display();
		Show thread2=new Show();
		thread1.start();
		thread2.start();

	}

}
