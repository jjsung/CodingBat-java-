package logic2;

public class RoundSum {
	public int roundSum(int a, int b, int c) {
		  
		
		return round10(a)+round10(b)+round10(c);
		
	}

	
	public int round10(int n)
	{


		if(n%10<5 )
			return n/10 *10;
		
		else
			return n/10*10+ 10;
	
	}
	
}
