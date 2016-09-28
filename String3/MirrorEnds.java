package string3;

public class MirrorEnds {
	public String mirrorEnds(String string) {
		  
		String bob="";
		int len=string.length();

	
			
		for( int i = 0, j = len - 1; i<len; i++, j--)
		{
			if(string.charAt(i)== string.charAt(j))
				bob+= string.charAt(i);
			else
				break; 
		}
		
		return bob;
		
		
		
	}

}
