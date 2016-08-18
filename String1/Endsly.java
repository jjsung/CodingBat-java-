package String1;

public class Endsly {
	public boolean endsLy(String str) {
	
	if(str.length()<2)
		return false;
		
	else
		return (str.substring(str.length()-2).equals("ly"));
			
	}

}
