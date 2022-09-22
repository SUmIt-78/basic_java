package sets;

import java.util.HashSet;
import java.util.Set;

public class sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits = Set.of("apple", "mango", "orange", "banana");
		Set<String> frt = new HashSet<String>(fruits);
		System.out.println(frt);
	}

}
/*
 * sets is basically interface which extend collection set is immutable.sets
 * does not follow any order you can not access set elements according to index
 * and sets does not allow any duplicate element There are some classes which
 * implements sets such as HashSet,LinkedHashSet,treeSet this all classes are
 * mutable
 */
