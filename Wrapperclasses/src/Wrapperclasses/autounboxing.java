package Wrapperclasses;

public class autounboxing {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Primitive dataType = " + a);

		Integer i = a; // Integer.valueOf(a);
		System.out.println("Wrapper  Object = " + i);
		
		int i1=i; // i.intValue();
		System.out.println("Primitive DataType = "+ i1);
		
		
		
	}
}
