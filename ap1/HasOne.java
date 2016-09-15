package ap1;

public class HasOne {
	public boolean hasOne(int n) {
	
		if(n%10==1) return true;
		if(n<10) return false;
		return hasOne(n/10);
		
	}
}
