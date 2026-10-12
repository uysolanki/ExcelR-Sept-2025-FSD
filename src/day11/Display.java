package day11;

public class Display extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}   //1000 means 1 second
		}
	}

}
