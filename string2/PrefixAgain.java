package string2;

public class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		
		String bob= str.substring(0, n); 
		for(int i=n; i<=str.length()-n; i++)
			if(str.substring(i, i+n).equals(bob) )
				return true;
		return false; 
		
	}

}
