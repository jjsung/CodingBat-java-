package array2;
/*
 * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */
public class IsEverywhere {
	public boolean isEverywhere(int[] nums, int val) {
		
		boolean truth1= true;
		boolean truth2= true;
		
		
		for(int i=0; i<nums.length;i+=2)
		{
			if(nums[i]!=val)
				truth1=false;
			 
		}
			
		for(int i=0; i<nums.length-1;i+=2)
		{	
			if(nums[i+1]!=val)
				truth2=false;
		}
			
			return truth1 || truth2; 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			
			 else if (nums.length%2==1 && nums[nums.length-1]==val)
				{	truth=true;}
				
				else if(nums.length%2==1 && nums[nums.length-1]!=val)
					{truth=false;}
			 
			
			 
			 if(nums[i]==val || nums[i+1]==val )
				
			{
				 if (nums.length%2==1 && nums[nums.length-1]==val)
					{	truth=true;}
				 else
					 truth=false;
				 }
			
				
			
			else
				{truth=false;}
		}
		return truth;*/
		
	}

}
