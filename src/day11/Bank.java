package day11;

public class Bank {

	private double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	
	
	
	public double getBalance() {
		return balance;
	}



	public synchronized void withdraw(double withdrawAmount)
	{
			if(withdrawAmount>balance)  //10000>5000 true
			{
				System.out.println("Insufficient funds, cannot withdraw "+withdrawAmount);
				try {
					wait();  
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance-=withdrawAmount;		//25000-10000
				System.out.println("Withdrwal Successful");
				System.out.println("Updated Balance is "+balance);
				//-->
			}
	}
	
	public synchronized void deposit(double depositAmount)
	{
		balance+=depositAmount;	//balance 25000
		notify();
			
	}
	
	
}
