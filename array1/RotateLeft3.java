package array1;
/*
 Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 */
public class RotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		
		int a= nums[0];
		for(int i=0; i<nums.length-1;i++)
		{
			
		nums[i]=nums[i+1];
		 
		} 
		nums[2]= a;
		return    nums; 

}
}
