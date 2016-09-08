package string2;

public class ReaptFront {
	public String repeatFront(String str, int n) {
		 
		String bob= "";
		
		for(int i=n; i>0; i--)
		{
			bob+= str.substring(0,i);
		}
		return bob; 
	}

}
