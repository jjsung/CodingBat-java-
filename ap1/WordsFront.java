package ap1;

public class WordsFront {
	public String[] wordsFront(String[] words, int n) {
		String[] bob=new String[n];
		for(int i=0; i< n; i++){
			bob[i]=words[i];
		}
		return bob;
	}
}
