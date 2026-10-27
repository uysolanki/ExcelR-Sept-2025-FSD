package day21;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class JuiceWorld2 {

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

	private static int prepareJuices(int orangeJuice, int mangoJuice, int pineAppleJuice) 
	{
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(orangeJuice);
		pq.add(mangoJuice);
		pq.add(pineAppleJuice);			//[3,0,0]
		
		
		int seconds=0;
		while(!pq.isEmpty())
		{
			int j1=0;					//j1  j2				[0]
			int j2=0;					//0	  0
										//3   0
			j1=pq.remove();				//2	  -1
			j2=pq.remove();
			j1--;
			j2--;
			seconds++;
			
			
			
			if(j1>0)
				pq.add(j1);
			
			if(j2>0)
				pq.add(j2);
		}
		
		return seconds;
		
	}

}
