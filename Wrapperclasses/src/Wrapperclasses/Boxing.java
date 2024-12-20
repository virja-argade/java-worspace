package Wrapperclasses;

public class Boxing {
	public static void main(String[] args) {

		int a = 10;
		System.out.println("Primitive value= " + a);

		Integer i = Integer.valueOf(a);
		System.out.println("Wrapper Object = " + i);

		double d = 56.00d;
		System.out.println(d);

		Double d1 = Double.valueOf(d);
		System.out.println("Warpper Object b= " + d1);
	}
}
