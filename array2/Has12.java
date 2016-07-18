package array2;
/*
 * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */
public class Has12 {
	public boolean has12(int[] nums) {
		  
		boolean bob=false;
		boolean bob2=false;
		int place=0;
		
		for(int i=0; i<nums.length-1;i++)
		{
			if(nums[i]==1)
				{bob=true;
				place=i;
				}
		
				
		}
		

		for(int i=place; i<nums.length;i++)
		{
			if(nums[i]==2)
				bob2=true;
				
		}
			
		
		 return bob && bob2;
			
		
		
	}

}
