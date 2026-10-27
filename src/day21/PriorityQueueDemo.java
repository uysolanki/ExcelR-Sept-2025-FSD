package day21;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.addAll(Arrays.asList(2,5,4,3,6));
		
		int stone1=pq.remove();
		System.out.println(stone1);
		int stone2=pq.remove();
		System.out.println(stone2);
		
		System.out.println(pq);
	}

}
