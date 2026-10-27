package day21;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class JuiceWorldWithoutIterator {

	public static void main(String[] args) {
		int orangeJuice=5;
		int mangoJuice=4;
		int pineAppleJuice=4;
		
//		int orangeJuice=3;
//		int mangoJuice=0;
//		int pineAppleJuice=0;

		int minTime=prepareJuices(orangeJuice,mangoJuice,pineAppleJuice);
		System.out.println(minTime);
	}

	private static int prepareJuices(int orangeJuice, int mangoJuice, int pineAppleJuice) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(orangeJuice);
		pq.add(mangoJuice);
		pq.add(pineAppleJuice);
		
		
		int seconds=0;
		while(pq.size()>1)   //2 elements			//[0]
		{
			int j1=0;
			int j2=0;
			
			j1=pq.remove();			//j1		j2
			j2=pq.remove();			//0			0
									//5			4
									//
			if(j1>0 && j2==0)
			{
				seconds+=j1;
				return seconds;
			}
			
			if(j1>0 && j2>0)
			{
				j1--;
				j2--;
				seconds++;
			}
			
			if(j1>0)
				pq.add(j1);
			
			if(j2>0)
				pq.add(j2);
		}
		
		
		seconds+=pq.peek();
		
		return seconds;
		
	}

}
