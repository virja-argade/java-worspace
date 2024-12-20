package defaultacessmodifier;

public class Demo1 {

   int a = 98;

   void m1() {
	System.out.println("m1 method of Demo1 class");
}   
   public static void main(String[] args) {

		Demo1 d1 = new Demo1();
		System.out.println(d1.a);
		d1.m1();
	}  
     
     
}