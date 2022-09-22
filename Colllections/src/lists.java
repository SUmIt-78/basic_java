import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class lists {
//basically List is type of interface and ArrayList,LinkedList,Vector are various classes impleting the List interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> practice = List.of("Apple", "Mango", "Pizza", "Burger");// Inetialising list List is Immutable
		System.out.println(practice.get(2));
		List<String> arrayPractice = new ArrayList<String>(practice);// converting list into arrayList to make it
																		// mutable
		arrayPractice.add("sumit");// now we can implement add method which is not possible in case of List
		List<String> linkedPractice = new LinkedList<String>(practice);
		linkedPractice.add("kela");
		List<String> vectorPractice = new Vector<String>(practice);
		vectorPractice.remove(1);
	}

}/*
	 * the basic datastructure beneath the arrayList and vector is array while
	 * beneath LinkedList is linkedList itself in case of arrays the iterations
	 * through various elements display element at particular index is quite fast
	 * than LinkedList but insertion,deletion of element is fast in case of
	 * Linkedlist also vector have most of its method as Synchronized so it is fully
	 * thread safer than arraylist.Synchronized means only one thread can acess that
	 * method at a time
	 */
