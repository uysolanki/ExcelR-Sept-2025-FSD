package day11;

public class Father extends Thread {

	Bank bank;
	public Father(Bank bank)
	{
		this.bank=bank;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	bank.deposit(20000);
	}
}
