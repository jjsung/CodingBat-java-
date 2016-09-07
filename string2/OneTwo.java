package string2;

public class OneTwo {
	public String oneTwo(String str) {
		
		
		String bob="";
		for(int i=0; i<str.length()-2; i++)
		{
			if(i%3==0)
			{bob+= str.substring(i+1,i+3);
			bob+=str.charAt(i);}
		}
	
		return bob;
			
	}

}

