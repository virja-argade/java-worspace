  package Wrapperclasses;
public class Autoboxing {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Primitive dataType = " + a);

		Integer i = a;  // Integer.valueOf(a);
		System.out.println("Wrapper  Object = " + i);
	}

}
