package string2;

public class Doublechar {


	public String doubleChar(String str) {
		
		String bob= "";
		for(int i=0;i<str.length();i++)
		{
			bob+= "" +str.charAt(i) + str.charAt(i);
			//bob+=str.substring(i, i+1) + str.substring(i, i+1);
			
		}
		return bob;
	}

}
