package day21;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class JuiceWorldChandana {

	public static void main(String[] args) {
//		int orangeJuice=5;
//		int mangoJuice=4;
//		int pineAppleJuice=4;
		
		int orangeJuice=3;
		int mangoJuice=0;
		int pineAppleJuice=0;

		int minTime=prepareJuices(orangeJuice,mangoJuice,pineAppleJuice);
		System.out.println(minTime);
	}

	private static int prepareJuices(int orangeJuice, int mangoJuice, int pineAppleJuice) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		if(orangeJuice>0)
		pq.add(orangeJuice);
		if(mangoJuice>0)
		pq.add(mangoJuice);
		if(pineAppleJuice>0)
		pq.add(pineAppleJuice);
		System.out.println("Queue Size " +pq.size());
	
		int seconds=0;
		while(pq.size()>1)					//[3]
		{
			int j1=0;
			int j2=0;						//j1		j2
											//0			0
			j1=pq.remove();					//15        0
			j2=pq.remove();					//14        -1	
											
				j1--;
				j2--;
				seconds++;
			
			
			if(j1>0)
				pq.add(j1);
			
			if(j2>0)
				pq.add(j2);
		}
		
		if(pq.size()==1)
			seconds+=pq.peek();
		
		return seconds;
		
	}

}
