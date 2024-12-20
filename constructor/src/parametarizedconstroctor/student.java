package parametarizedconstroctor;

public class student {
	int rollno;

	String name;

	String addr;

	public student(int rollno, String name, String addr) {
		super();
		this.rollno = 22;
		this.name = name;
		this.addr = addr;
	}

	public static void main(String[] args) {

		student stu = new student(11,"Santosh","Pune");
	}
}
