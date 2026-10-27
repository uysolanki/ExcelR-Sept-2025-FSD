package day21;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class StoneCrushing {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.addAll(Arrays.asList(2,5,5,3,6)); //2,3,5,1  //2,2,1  //[1]
		
		while(pq.size()>1)
		{
			int stone1=pq.remove();
			int stone2=pq.remove();
			int diff=stone1-stone2;
			if(diff>0)
				pq.add(diff);
				
		}
		
		System.out.println(pq.size()==1? pq.peek() + " Stone left" : "No Stones Left");
	}

}
