package string2;

public class XyBalance {
	public boolean xyBalance(String str) {
		  
		int xcount=0;
		
				
	
	for(int i=0; i<str.length(); i++)
	{
		if(str.charAt(i)=='x' )
			xcount++;
		
		if(str.charAt(i)=='y' )
			xcount=0;
	}
	
	return xcount==0;
	
	
	
}
	}
