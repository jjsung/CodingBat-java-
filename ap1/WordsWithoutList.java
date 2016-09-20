package ap1;

public class WordsWithoutList {
	public List wordsWithoutList(String[] words, int len) {
		  List bob = new ArrayList();		 
				for(int i=0; i< words.length; i++){
				    if(words[i].length() != len)
				       bob.add(words[i]);
				  }
				  return bob;
		}

}
