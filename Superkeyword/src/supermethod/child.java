package supermethod;

public class child  extends perent{
	public void m1() {
		System.out.println("m1 method of child class");
		super.m1();
	}
	public static void main(String[]args) {
		child c = new child();
		c.m1();
	}

}
