package array2;
/*
 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3])  true
haveThree([3, 1, 3, 3])  false
haveThree([3, 4, 3, 3, 4])  false
 */
public class Havethree {
	
	
	public static void main(String[] args)
	{
int[] bob= {3,1,3,3};
		
		System.out.println(haveThree(bob)); 
	}
	
	
	public static boolean haveThree(int[] nums) {
		  
		boolean whatsgood= true;
		int counter=0;
		
		for(int i=0; i<nums.length-1;i++)
		{
			if(nums[i]==3 && nums[i+1]==3 )
				whatsgood= false;
			
			
		}
		for(int i=0; i<nums.length;i++)
		{
			
			if(nums[i]==3)
				counter++;
			
		}
		
		if(whatsgood== true && counter==3)
			return true;
		else
			return whatsgood;
		
		
	}

}
