package String1;

public class SeeColor {
	public String seeColor(String str) {
		
		if(str.length()>2 && str.substring(0, 3).equals("red"))
			return "red";
		if(str.length()>3 && str.substring(0, 4).equals("blue"))
			return "blue";
		
		return "";
	}

}