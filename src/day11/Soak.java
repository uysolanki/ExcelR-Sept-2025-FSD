package day11;

public class Soak extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=5;)
		{
			System.out.println("Soak "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
