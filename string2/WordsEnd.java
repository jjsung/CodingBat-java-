package string2;

public class WordsEnd {
	public String wordEnds(String str, String word) {
		String bob="";
		int indexw= str.indexOf(word);
		
		
		while(indexw !=-1)
		{
			if (indexw !=0) bob+= str.charAt(indexw-1);
			if(indexw + word.length() ==str.length()) break;
			
			bob+= str.charAt(indexw+word.length());
			indexw=str.indexOf(word,indexw+1 );
			
			
		}
		
		return bob; 
		
		
		
		
		
	}

}

/*
String bob="";
int wordl= word.length();
int strl= str.length();


for(int i=0; i<strl;i++ )
{
	if(i==0 && str.substring(i, i+wordl).equals(word))
		{bob+= ""+ str.charAt(i+wordl);
		i+=wordl;}
	
	 if(i==strl-wordl && str.substring(i, i+wordl).equals(word))
		{bob+=""+ str.charAt(i-1);
		i+=wordl;}
	
	if(i>0 && i<strl-wordl && str.substring(i, i+wordl).equals(word))
		{bob+=""+str.charAt(i-1)+ str.charAt(i+wordl);
		i+=wordl;//?
		}
		
	
	
}
	return bob;
*/