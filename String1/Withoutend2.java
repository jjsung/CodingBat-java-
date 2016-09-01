package String1;

public class Withoutend2 {
	public String withouEnd2(String str) {
		  
		if(str.length()<=2)
			return "";
		else
			return str.substring(1, str.length()-1);
	}

}
