package logic2;

public class MakeBricks {
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(makeBricks(3, 1, 8));
	}
	
	
	public static boolean makeBricks(int small, int big, int goal) {
		
		
		
		return goal<= (5 * big)+small &&  goal%5 <= small ;		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
