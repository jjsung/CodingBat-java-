package array2;
/*
 * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
public class Centeredaverage {
	public int centeredAverage(int[] nums) {
		int min=nums[0];
		int max=nums[0];
		int sum=0;
		int total=0;

		for(int i=0; i < nums.length; i++)
		{
			if (min>nums[i])
				min=nums[i];
			if (max<nums[i])
				max=nums[i];
		}
		
		for(int i=0; i < nums.length; i++)
		{
			sum+=nums[i];
		}
		total= (sum-(max+min))/(nums.length-2);
		return total;
		
	}

}
