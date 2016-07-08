package array1;

public class FirstLast6 {

	public static void main(String[] args) {

		int[] bob= {6,7,3,3,5,6,7,4,5};
		System.out.println(firstLast6(bob));
	}
	
	public static boolean firstLast6(int[] nums) {
		
		int length= nums.length;
		if(nums[0]==6 || nums[length-1]==6)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
