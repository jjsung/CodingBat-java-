package string2;
/*
 * Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
 */
public class Endother {
	public boolean endOther(String a, String b) {
		
		String a1= a.toLowerCase();
		String b1= b.toLowerCase();
		
		return (a1.length()>= b1.length() && a1.substring(a1.length()-b1.length()).equals(b1)) || (b1.length()>= a1.length() ) && b1.substring(b1.length()-a1.length()).equals(a1) ;
			
		
	}

}
