package string2;

public class RepeatEnd {
	public String repeatEnd(String str, int n) {
		
		String bob=str.substring(str.length()-n);
		String dav="";
		
		for(int i=0; i<n; i++)
		{
			dav+=bob;
			
		}
		return dav;
	}

}
