package collections.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortByValues {
	
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("1.", 1);
		map.put("4.", 4);
		map.put("2.", 2);
		map.put("3.", 3);
		ArrayList list = new ArrayList<Integer>(map.values());
		Collections.sort(list);
		System.out.println(list);
		LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
		Set<Entry<String,Integer>> entries = map.entrySet();
		for(int i=0;i<list.size();i++) {
			for(Map.Entry<String,Integer> entry:entries) {
				if(list.get(i)==entry.getValue()) {
					result.put(entry.getKey(), entry.getValue());
				}
			}
			
		}
		System.out.println(result);
	}

}
