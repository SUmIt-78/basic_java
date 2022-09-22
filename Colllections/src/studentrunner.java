import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class studentrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> stud = List.of(new student("ram", 95), new student("sam", 87), new student("alexa", 96));
		List<student> studAL = new ArrayList<student>(stud);
		List<Integer> num = List.of(12, 676, 10, 55, 89, 43);
		List<Integer> num1 = new ArrayList<Integer>(num);

		Collections.sort(num1);
		System.out.println(num1);
		Collections.sort(studAL);
		System.out.println(studAL);
	}

}
