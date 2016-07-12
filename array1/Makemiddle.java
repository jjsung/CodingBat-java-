package array1;
/*
 * given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
 * makeMiddle([1, 2, 3, 4])  [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9])  [2, 3]
makeMiddle([1, 2])  [1, 2]

 */
public class Makemiddle {
	public int[] makeMiddle(int[] nums) {
		
		int hlength=nums.length/2; 
		int[] newarray= new int[2];
		
	
			 newarray[0]= nums[hlength-1];
			newarray[1]= nums[hlength];
		return newarray;
				
		
	}

}
