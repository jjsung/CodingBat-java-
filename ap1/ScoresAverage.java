package ap1;

public class ScoresAverage {
	public int scoresAverage(int[] scores) {
		int first= firstHalf(scores); 
		int second= secondHalf(scores);
		if(first>second) return first;
		else
			return second;
	}
	public int firstHalf(int[] bob){
		int x=0;
		for(int i=0; i< bob.length/2; i++){
			x+= bob[i];
		}
		return x/(bob.length/2);
		
	}
	public int secondHalf(int[] bob){
		int x=0;
		for(int i=bob.length/2; i< bob.length; i++){
			x+= bob[i];
		}
		return x/(bob.length/2);
}
}