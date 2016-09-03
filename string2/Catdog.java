package string2;

public class Catdog {
	public boolean catDog(String str) {
		
		int catc=0;
		int dogc=0;
		
		for(int i=0;i<str.length()-2;i++)
		{
			if(str.substring(i, i+3).equals("cat"))
				catc++;
			if(str.substring(i, i+3).equals("dog"))
				dogc++;
			
		}
		
		
		if(catc==dogc)
			return true;
		return false;
		
		
		
		
		
	}

}
