package String1;

public class Minicat {
	public String minCat(String a, String b) {
		  
		if(a.length() > b.length() )
			return a.substring(a.length()- b.length())+b;
		
		if(b.length()>  a.length() )
			return a+ b.substring(b.length()-a.length());
		
		return a+b;
		
	}

}
