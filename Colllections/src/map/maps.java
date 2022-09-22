package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class maps {
	// map is used to store key value pairs it dosent maintain any order just like
	// set
	/*
	 * Map is also an interface but it does not extends Collections.Map is immutable
	 * but we can create mutable map using the classes which extends Map inteface
	 * this classes are HashMap LinkedHashMap,TreeMap
	 */
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Map<String, Integer> mp = Map.of("A", 1, "E", 2, "I", 3, "O", 4);
		System.out.println(mp);
		System.out.println(mp.size());
		System.out.println(mp.get("E"));// this method take key as input and return value corresponding to key.if key
										// not present it will return null
		System.out.println(mp.get("B"));
		System.out.println(mp.containsKey("E"));// if key is present it will return true else false
		System.out.println(mp.containsValue(2));
		System.out.println(mp.keySet());// it will give all keys present in map
		System.out.println(mp.values());// it will give all values
		Map<String, Integer> hmp = new HashMap<String, Integer>(mp);
		// it dosent maintain the insertion order nor the sort order just like set
		hmp.put("U", 5);
		System.out.println(hmp);
		Map<String, Integer> lhmp = new LinkedHashMap<String, Integer>(mp);
		// it maintain insertion order
		lhmp.put("U", 5);
		System.out.println(lhmp);
		Map<String, Integer> tmp = new TreeMap<String, Integer>(mp);
		// it maintain sorting order it will sort elements in ascrnding order
		tmp.put("U", 5);
		System.out.println(tmp);

	}

}
