package array1;
/*
 * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
 double23([2, 2])  true
double23([3, 3])  true
double23([2, 3]) false
 */
public class Double23 {
	public boolean double23(int[] nums) {
		 
		int twocounter=0;
		int threecounter=0;
		
		for(int i=0; i<nums.length;i++)
		   {
			if( nums[i]==2 )
			  twocounter++;
		
		   if( nums[i]==3 )
			 threecounter++;
		  
		   }

		if(twocounter==2 || threecounter==2)   
		   return true;
		else
			return false;
	}

}
