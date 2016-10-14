package map1;

public class Topping2 {
	  
	  if (map.containsKey("ice cream")) {
	    map.put("yogurt", map.get("ice cream"));
	  }
	   
	  if (map.containsKey("spinach")) {
	    map.put("spinach", "nuts");
	  }
	 
	  return map;
}
