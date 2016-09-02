package String1;

public class Withoutx {
	public String withoutX(String str) {
		
	        if (str.length() == 0) return "";
	        if (str.charAt(0) == 'x') str = str.substring(1);
	        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x')
	            str = str.substring(0, str.length() - 1);
	        return str;
	}
}
