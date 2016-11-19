package map2;

public class wordCount {
	
	  public Map<String, Integer> wordCount(String[] strings) {
		    
		    Map<String,Integer> map1 = new HashMap<String, Integer>();
		    
		    for(int i=0; i<strings.length; i++){
		      int counter=0;
		      String tmp=strings[i];
		      
		      if(map1.containsKey(tmp)){
		        counter= map1.get(tmp);
		        map1.put(tmp, counter+1);
		        }
		      else
		         map1.put(tmp, 1);
		    }
		    return map1;
		  }

}
