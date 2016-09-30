package string3;

public class NotReplace {
	public String notReplace(String str) {
		
		str= " "+ str+ " ";
		for(int i=1; i< str.length()-2;i++)
		{  
			if(str.substring(i, i+2).equals("is") && !Character.isLetter(str.charAt(i+2)) &&  !Character.isLetter(str.charAt(i-1))    )
			{
				str= str.substring(0, i+2)+ " not" + str.substring(i+2);
			}
		}
			return str.substring(1,str.length()-1); 		
	}

}



