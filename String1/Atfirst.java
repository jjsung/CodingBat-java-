package String1;

public class Atfirst {
	public String atFirst(String str) {
	
	if(str.length()<1)
		return "@"+"@";	
		
	else if(str.length()<2)
		return str+"@";
		
	else
		return str.substring(0, 2);
	}

}
