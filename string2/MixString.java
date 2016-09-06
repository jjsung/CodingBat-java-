package string2;

public class MixString {
	public String mixString(String a, String b) {
		  
		String bob="";
		
		if(a.length()>= b.length())
			{
			
			
			for(int i=0; i<b.length(); i++)
			{
				bob+=""+a.charAt(i)+ b.charAt(i);
				
			}
			
			
			bob += a.substring(b.length());
			}
		
		
		if(b.length()> a.length())
			{
		
			
			
	
			for(int i=0; i<a.length(); i++)
			{
				bob+=""+a.charAt(i)+ b.charAt(i);
			
			}
			  bob +=b.substring(a.length());
		
			}
		
		
		
		return bob;
	}

}
