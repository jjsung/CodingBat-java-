package string2;

public class PlusOut {
	
	 public static void main(String[] args) {
		 
		 
		 System.out.println(plusOut("aaxxxxbb", "xx"));
	 }
	
	
	public static String plusOut(String str, String word) {
		int i=0;  
		String bob="";
		while(i<str.length())
		{
			if(i<=str.length()-word.length() &&  str.substring(i, i+word.length()).equals(word) )
				{bob+=word; 
				i+= word.length();}
			else
			{
			
			bob+='+';
			i++;
			}
		}
		return bob;
	}

}
