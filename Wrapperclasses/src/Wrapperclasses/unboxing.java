package Wrapperclasses;

public class unboxing {
	public static void main(String[] args) {

		int a = 10;
		System.out.println("Primitive value= " + a);

		Integer i = Integer.valueOf(a);
		System.out.println("Wrapper Object = " + i);
		
		int intValue = i.intValue();
         System.out.println("Primitive data Type = "+ intValue);
		
         
         double d = 56.00d;
		System.out.println(d);

		Double d1 = Double.valueOf(d);
		System.out.println("Warpper Object b= " + d1);
		 
		double doubleValue = d1.doubleValue();
		System.out.println(doubleValue);
		
		
		
		
	}
}
