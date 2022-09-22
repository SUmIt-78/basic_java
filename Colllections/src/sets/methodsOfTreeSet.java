package sets;

import java.util.Set;
import java.util.TreeSet;

public class methodsOfTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> num = new TreeSet<Integer>(Set.of(12, 45, 67, 78, 69, 34, 56, 65, 90, 99, 76));
		System.out.println(num);
		System.out.println(num.floor(65));// if same no is present in tree set it will return
		// that no otherwise it will return the first lower no
		System.out.println(num.lower(65));// it return first lower no.
		System.out.println(num.ceiling(76));
		// if same no is present in tree set it will return that no otherwise it will
		// return the first greater no
		System.out.println(num.higher(76));// it return first higher no.
		System.out.println(num.subSet(45, 78));// it return all the elements present between
		// two no the lower limit is included while upper limit is not included
		System.out.println(num.headSet(56, false));// it will return all no less than the provided no.
		// simply false means does not include the no provided to you.
		System.out.println(num.headSet(56, true));// it will return all no less than and equal to provided no
		// simply true means include the no provided to you in result if that no is
		// present in treeSet
		System.out.println(num.tailSet(67, true));// it will return all greater than and equal to provided no
		// simply true means include the no provided to you in result if that no is
		// present in treeSet
		System.out.println(num.tailSet(67, false));// it will return all no less than the provided no.
		// simply false means does not include the no provided to you.

	}

}
