package constructor;

public class Default {

	int rollno;

	String name;

	String addr;

	public Default() {
	
		System.out.println("Student class Constructor");
	}

	public static void main(String[] args) {

		Default stu = new Default();
	}
}
