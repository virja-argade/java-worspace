package exceptionHandling;

public class demo1 {
	public static void main(String[] args) {

		System.out.println("Main method execution started");

		int a = 10;
		int b = 2;
		int c = a / b;
		System.out.println(c);

		System.out.println("Main method execution Ended");

	}




//Example :2

	public static void main1(String[] args) {

		System.out.println("Main method execution started");

		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);

		System.out.println("Main method execution Ended");

	}






//Example :3

	public static void main2(String[] args) {

		System.out.println("Main method execution started");

		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {

		}
		System.out.println("Main method execution Ended");

	}
}

