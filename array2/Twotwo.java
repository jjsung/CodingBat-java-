package array2;
/*
 * Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */
public class Twotwo {
	public boolean twoTwo(int[] nums) {
		
		int twocounter=0;
		
		
		
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==2 )
				twocounter++;
			
		}
		if(twocounter%2!=0)
			return false;
		else 
			return true;
	
		
	}

}

/*
boolean whatsgood= false;


for(int i=0; i<nums.length-1;i++)
{
	if(nums[i]==2 && nums[i+1]==2 )
		whatsgood= true ;
	
	if(nums[i]==2 && nums[i+1]!=2  )
		{whatsgood= false ;
		break;}
		
	if(nums[nums.length-1]==2 && nums[nums.length-2]!=2  )
		{whatsgood= false ;
		break;}
	
}

return whatsgood; 
	*/