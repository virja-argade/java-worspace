package BasicsofExceptionHandaling;

public class demo6 {
	public void m1() {
		System.out.println("m1 method started");

		m2();

		System.out.println("m1 method Ended");
	}

	public void m2() {
		System.out.println("m2 method started");
		int a = 10;
		int b = 0;

		int c = a / b;
		System.out.println(c);

		System.out.println("m2 method Ended");
	}

	public static void main(String[] args) {

		System.out.println("Main method execution started");

		ExceptionDemo ed = new ExceptionDemo();
		
			ed.m1();
		
		System.out.println("Main method execution Ended");
	}
}
