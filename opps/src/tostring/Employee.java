package tostring;

public class Employee {
	public int id;
	public String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return id + ""+ name;
		
	}
	
	
	public static void main (String[]args) {
		Employee e = new Employee();
		e.setId(123);
		e.setName("virija");
		
		System.out.println(e);
	}
	

}
