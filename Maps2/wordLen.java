package map2;

public class wordLen {
	public Map<String, Integer> wordLen(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  for (int i = 0; i < strings.length; i++) {
		    String tmp = strings[i];
		    map.put(tmp, tmp.length());
		  }
		  return map;
		}
}
