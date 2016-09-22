package string3;

public class CountYz {
	
	

	
	public static int countYZ(String str) 
	{		  
		str= str.toLowerCase()+" "; 	
		int counter=0;
		
		for(int i=0; i<str.length()-1;i++)
		{
			
			 if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && !Character.isLetter(str.charAt(i + 1)))
				counter++;
		}
			return counter; 
		
		
	}
	}


/*

First version:
str= str.toLowerCase(); 
int counter=0;
	
		for(int i=0; i<str.length()-1;i++)
		{
			
			if(str.charAt(i)=='y'&& Character.isLetter(str.charAt(i+1))==false ||str.charAt(i)=='z' && Character.isLetter(str.charAt(i+1))==false )
				counter++;
         
		}
		
		if(str.charAt(str.length()-1)== 'y' || str.charAt(str.length()-1)== 'z' )
				counter++;
		
		return counter; 
*/