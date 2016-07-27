package logic2;

public class BlackJack {
	 public static void main(String[] args) {
		 
		 System.out.println(blackjack(22, 50));
	 }
	public static int blackjack(int a, int b) {
		  
		if(a>21 )
			a= -1;
		if(b>21 )
			b= -1;
		
		if(Math.abs(21-a)<Math.abs(21-b) )
			return a;
		if(Math.abs(21-b)<Math.abs(21-a) )
			return b;
		else
			return 0;
		
	}

}
