package string3;

public class EqualIsNot {
	public boolean equalIsNot(String str) {
	
		  int icounter=0;
			int ncounter=0;
			
			
			for(int i=0; i<str.length();i++)
			{
				if(i<=str.length()-3 && str.substring(i, i+3).equals("not"))
					ncounter++;
				if(i<=str.length()-2 && str.substring(i, i+2).equals("is"))
					icounter++;
			}
			return ncounter==icounter;
	}

}
