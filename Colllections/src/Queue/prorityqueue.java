package Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/*Queue is also an interface which extends Collection the class which implement queue is 
 * priority queue in. Queue we can store elements in the order we want by default in 
 * priority queue the elements are stored in ascending order*/
public class prorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq = new PriorityQueue<String>(List.of("cat", "zebra", "dog", "monkey", "camel"));
		pq.add("lion");
		System.out.println(pq);// by default priority queue will arrange elements in ascending order
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
