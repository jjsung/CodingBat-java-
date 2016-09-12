package string2;

public class XyzMiddle {
	public boolean xyzMiddle(String str) {
		
		int sl=str.length()/2;
		
		if(str.length()<3)
			return false;
		if(str.length()%2==0)
			return str.substring(sl-2, sl+1).equals("xyz") || str.substring(sl-1, sl+2).equals("xyz");
				
		
		
		
		return str.substring(sl-1, sl+2).equals("xyz");
				
			
		
	}

}
/*
version 1
	
		int sl=str.length()/2;
		
		if(str.length()>=3)
			{if(str.length()%2==0)
				if(str.substring(sl-2, sl+1).equals("xyz") || str.substring(sl-1, sl+2).equals("xyz")  )
					return true;
			
			
			if(str.length()%2!=0)
				if(str.substring(sl-1, sl+2).equals("xyz"))
					return true;}
			return false;

*/