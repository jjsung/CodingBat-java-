package logic2;

public class MakeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		
		if (goal <= (5 * big)+small && goal%5 <=small  ) 
		
		
		
	
			return goal -big *5; 
		else
			return -1; 
		
		
	}

}
(4, 1, 9) → 4
(4, 1, 10) → -1

(6, 2, 7) → 2 but -3