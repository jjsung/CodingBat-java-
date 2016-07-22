package array2;
/*
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */







public class Shiftleft {
	public int[] shiftLeft(int[] nums) {
		  
		int[] newnew=new int[nums.length];
		
		
		if(newnew.length==0)
			return newnew;
		
		int beg= nums[0];
		for(int i=1; i<newnew.length;i++)
		{
			
			newnew[i-1]=nums[i];
		}
		
		newnew[newnew.length-1]= beg;
		
		return newnew;
		
		
		
		
		
	}

}
