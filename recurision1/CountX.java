package recursion1;

public class CountX {
	
	public int countX(String str) {
	int counter=0;
	if(str.length()==0) return 0;
	if(str.charAt(str.length()-1)== 'x')
			counter=1;
	return counter+ countX(str.substring(0, str.length()-1));
	}

}
