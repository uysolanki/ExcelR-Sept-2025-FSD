package day14;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import day4.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class StreamingAPIDemo5 {

	public static void main(String[] args) {
		int arr[]= {23, 18, 25, 40, 29};
//		Arrays.stream(arr)
//		.filter(num->{
//			int flag=0;															
//			for(int j=2;j<=Math.sqrt(num);j++)						
//			{
//				if(num%j==0)
//				{
//					flag=1;
//					break;
//				}
//			}
//			if(flag==0)
//			return true;
//			else
//			return false;
//		}).forEach(n->System.out.println(n));
		
		
		Arrays.stream(arr)
		.filter(PrimeNumberUsingFunction2::checkPrime).forEach(n->System.out.println(n));
	}

	
}
