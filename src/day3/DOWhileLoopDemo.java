//Problem statement: Write a program to display your name 5 times
package day3;

public class DOWhileLoopDemo {

	public static void main(String[] args) {
	
		
		int i=100;	//Initialisation
		
		do
		{
			System.out.println("Virat Kohli " + i);
			
			i=i+1;
		}while(i<=5);  //condition is checked at exit time
	}

}

/* output 
Virat Kohli 1
Virat Kohli 2
Virat Kohli 3
Virat Kohli 4
Virat Kohli 5

*/