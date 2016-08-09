package recursion1;

public class ParenBit {
	public String parenBit(String str) {

			if(str.substring(0,2).equals("()")) return str;
			if(str.charAt(0)=='(') 
			if(str.charAt(1)!= ')')
				return str.substring(0, str.indexOf(')')+1);
			return parenBit(str.substring(1));
	  
	}

}
