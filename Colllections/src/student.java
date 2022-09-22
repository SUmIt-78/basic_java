
public class student implements Comparable<student> {
	String name;
	int id;

	public student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name + " " + id;
	}

	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}

}