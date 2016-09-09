package string2;

public class RepeatSeperator {
	public String repeatSeparator(String word, String sep, int count) {
	
		 
		String bob= "";
		
		for(int i=0; i<count; i++)
		{
			bob+= word;
			if(i!=count-1)
				bob+= sep;
			
		}
		return bob;
	}

}
