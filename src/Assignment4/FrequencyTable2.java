package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTable2 {
 

	public static void main(String[] args) {
	Map<String, Integer> table = new HashMap<>() ; 
	
	for(String str : args) {
		Integer counter = table.get(str) ; 
		
		if(counter == null) {
			table.put(str, 1) ; 
		}
		else
			table.put(str, ++counter); 		
	}
	for(Map.Entry<String, Integer> e : table.entrySet()) {
		System.out.println(e.getKey() + ":" + e.getValue());
	}
	}
}

