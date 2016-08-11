package recursion1;

public class StrDist {
	public int strDist(String str, String sub) {
		if(str.length()<sub.length()) return 0;
		if(str.substring(0, sub.length()).equals(sub)) 
			{
			 if(!str.substring(sub.length(), sub.length()+sub.length()).equals(sub))
				 {return 1+ strDist(str.substring(sub.length()+1),sub);}
			
				 return sub.length()+sub.length();
			 
			}
				
		return strDist(str.substring(1), sub);
	}
}
