package string3;

public class SumNumbers {
	public int sumNumbers(String str) {
		  
		String sNum="";
		int aNum=0;
		boolean check=false;
		str= str+" ";
		
		for(int i=0; i< str.length();i++)
		{
			if( Character.isDigit(str.charAt(i)))   
				{sNum+=str.charAt(i);
				check=true;}
			else
				if(check==true){
				aNum+= Integer.parseInt(sNum);
				check=false;
				sNum="";}
			
		}
		
		return aNum; 		
	}

}
