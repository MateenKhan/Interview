package collections.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class SortByKeys {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(2, "2.");
		map.put(3, "3.");
		map.put(1, "1.");
		map.put(5, "5.");
		System.out.println(map);
		System.out.println(new HashMap<>(map));
		HashMap<Integer, String> result = new HashMap<>();
		List<Integer> list = new LinkedList<>(map.keySet());
		Collections.sort(list);
		for(Integer elem:list) {
			result.put(elem, map.get(elem));
		}
		System.out.println(result);
	}

}
