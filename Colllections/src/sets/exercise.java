package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> c = List.of('A', 'Z', 'A', 'B', 'Z', 'F', 'q');
		Set<Character> hs = new HashSet<Character>(c);
		System.out.println("we dont maintain insertion as well as sort order" + hs);

		Set<Character> lhs = new LinkedHashSet<Character>(c);// we can convert list into Hashset,LinkedHashset and
																// TreeSet

		System.out.println("insertion order is maintained" + lhs);

		Set<Character> ts = new TreeSet<Character>(c);

		System.out.println("we sorted element" + ts);
	}
}
/*
 * HashSet does not follow insertion order and also dose not follow sort order.
 * LinkedHashSet follow insertion order and also dose not follow sort order.
 * TreeSet does not follow insertion order but follow sort order.it sort
 * elements in ascending order.
 */