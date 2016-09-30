package string3;

public class SameEnds {
	public String sameEnds(String string) {
	 
		String bob="";
		int len=string.length()/2;

		for(int i=0; i<len;i++)
		{
			for(int j=len;j<string.length(); j++)
				if(string.substring(0,i+1).equals(string.substring(j)))
					bob= string.substring(0,i+1);
			
		}
		return bob;
	}

}
