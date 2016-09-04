package string2;
/*
 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb")  1
countCode("codexxcode")  2
countCode("cozexxcope") 2
 */
public class Countcode {
	public int countCode(String str) {
		int counter=0;

		for(int i=0;i<str.length()-3;i++)
		{
			if(str.substring(i, i+2).equals("co") &&str.charAt(i+3)=='e' )
				counter++;
				
		}
		
		return counter; 
		
	}

}
