package map;

import java.util.Map;
import java.util.TreeMap;

public class mapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is an awsome occasion" + "This has never happed before";
		Map<Character, Integer> occurance = new TreeMap<Character, Integer>();
		char[] characterArray = str.toCharArray();
		for (char characters : characterArray) {
			Integer num = occurance.get(characters);
			if (num == null) {
				occurance.put(characters, 1);
			} else {
				occurance.put(characters, num + 1);
			}
		}
		System.out.println(occurance);
		// TODO Auto-generated method stub
		String str1 = "This is an awsome occasion " + "This has never happed before";
		Map<String, Integer> stringoccurance = new TreeMap<String, Integer>();
		String[] stringArray = str1.split(" ");
		for (String strings : stringArray) {
			Integer num = stringoccurance.get(strings);
			if (num == null) {
				stringoccurance.put(strings, 1);
			} else {
				stringoccurance.put(strings, num + 1);
			}
		}
		System.out.println(stringoccurance);
	}

}
