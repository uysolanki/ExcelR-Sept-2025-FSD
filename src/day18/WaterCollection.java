package day18;

public class WaterCollection {

	public static void main(String[] args) {
		int heights[]= {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int max=maxWater(heights);
		System.out.println(max);
	}
															//start														   end
	private static int maxWater(int[] heights)				//1, 	8, 		6, 		2, 		5, 		4, 		8, 		3, 		7
	{
		
		int start=0;
		int end=heights.length-1;
		
		int maxArea=0;			//0,8
		
		while(start<end)
		{
		int height=Math.min(heights[start], heights[end]);   //height=1
		int width=end-start;								 //width=8
		
		int area=height*width;								 //area=8
		
		maxArea=Math.max(area,maxArea);
		
		if(heights[start]<=heights[end])
			start++;
		else
			end--;
		}	
		return maxArea;
	}

}
