package String1;

public class Defront {
	public String deFront(String str) {    
		
		if(str.substring(0, 1).equals("a")&&str.substring(1, 2).equals("b"))
			return str;
		if(str.substring(0, 1).equals("a"))
			return "a"+str.substring(2);
		if(str.substring(1, 2).equals("b"))
			return "b"+str.substring(2);
		
		return str.substring(2);
		
	}

}
