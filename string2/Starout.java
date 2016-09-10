package string2;

public class Starout {
	public String starOut(String str) {
		
		String bob="";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='*')
				continue;
				
			if(i<str.length()-1 && str.charAt(i+1)=='*'|| (i>0 && str.charAt(i-1)=='*') )
				continue;
			bob+= str.charAt(i);
		}
		return bob; 
		
	}

}

