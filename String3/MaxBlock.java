package string3;

public class MaxBlock {
	public int maxBlock(String str) {
		  
		 int counter=1;
			int max=0;
			for(int i=0; i< str.length();i++)
				{
				if(counter>max)
					  max=counter;
				if(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
					counter++;
				
				else
					counter=1;
						
			}
			
			
			return max; 
		
		
	
		
		
		
		
		
		
	}

}
