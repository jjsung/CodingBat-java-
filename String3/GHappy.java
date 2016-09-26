package string3;

public class GHappy {
	public boolean gHappy(String str) {
		
		boolean value=true;
		 str= "x"+ str+ "x";
		
		for(int i=1; i<str.length()-1;i++)
		{
			if((str.charAt(i)=='g'&& str.charAt(i-1)!='g') && (str.charAt(i)=='g'&& str.charAt(i+1)!='g') )
				value=false;
		}
		
		return value;
	}

}
