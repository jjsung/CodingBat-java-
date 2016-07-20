package array2;
/*
 * Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
public class More14 {
	public boolean more14(int[] nums) {
		  
		int onec=0;
		int fourc=0;

		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==1)
				onec++;
			if(nums[i]==4)
				fourc++;
	    }
		if(onec>fourc)
			return true;
		else
			return false; 

}}
