import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class methodsOfCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> valorant = List.of("sova", "sage", "sky");
		ArrayList<String> valorant1 = new ArrayList();
		valorant1.addAll(valorant);// it is used to add another collection of elements
		valorant1.add("killjoy");// it will add the element at end of list
		valorant1.add(2, "jett");// it will add the element at the index provided
		System.out.println(valorant1.size());// it give size of list
		valorant1.set(1, "Raze");// this will interchange the element at provided index with element we provided
		valorant1.get(4);// return element present at that index
		valorant1.remove(2);// remove element at index we provided
		System.out.println(valorant1);
		// LOOPING THROUGH COLLECTIONS
		for (int i = 0; i < valorant1.size(); i++) {// simple for loop looping
			System.out.println(valorant1.get(i));
		}
		System.out.println("enhanced for loop");
		for (String val : valorant1) {// enhanced for loop
			System.out.println(val);
		}
		Iterator<String> it = valorant1.iterator();// looping using iterator
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
		// when we have to perform deletion task on collections then always use

		while (it.hasNext()) {
			if (it.next().contains("va")) {
				it.remove();
			}
		}
		System.out.println(valorant1);

	}
}
