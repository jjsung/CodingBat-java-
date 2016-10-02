package string3;

public class WithoutString {
	public String withoutString(String base, String remove) {
	
		String bob="";
		int Index= base.toLowerCase().indexOf(remove.toLowerCase());
	
		while(Index !=-1){
			
			bob+= base.substring(0, Index);
			base= base.substring(Index+remove.length());
			Index= base.toLowerCase().indexOf(remove.toLowerCase());
			
		}
		bob+=base; 
		
		return bob;
		
	}

}

/*	
 * 
 Version 1
 int RL= remove.length();
String bob="";

for(int i=0; i<base.length();i++)
{
	if(i<=base.length()-RL && base.toLowerCase().substring(i,i+RL).equals(remove.toLowerCase()))  
		{
		i += RL-1;
		  continue;
		}
	else
	  bob+= base.charAt(i);

}
return bob; 


version 2

 int RL= remove.length();
String bob="";

for(int i=0; i<base.length();i++)
{
	if(i<=base.length()-RL && base.substring(i, i+rLen).equalsIgnoreCase(remove)))  
		{
		i += RL-1;
		
		}
	else
	  bob+= base.charAt(i);

}
return bob; 
	
*/