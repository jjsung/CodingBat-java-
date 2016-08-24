package String1;

public class Lasttwo {
	public String lastTwo(String str) {
		  
		int bob= str.length(); 
		if(str.length()>=2 )
			return str.substring(0, bob-2) + str.substring(bob-1) + str.substring(bob-2, bob-1);
		return str;
		
	}

}
