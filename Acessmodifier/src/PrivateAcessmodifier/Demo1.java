package PrivateAcessmodifier;

public class Demo1 {
//example1
        private int a = 75;
        private void m1() {
     	  System.out.println("m1 method of demo 1 class");
     	          }
          
       public static void main(String[]args) {
    	  Demo1 D1 = new Demo1() ;
    	  D1.m1();
    	  } 
   
//example2
//      private int a = 34;
//      private void m1() {
//    	  System.out.println("m1 method of demo 1 class");
//    	  
//      }
//     public static void main (String[]args) {
//    	 Demo1 D1 = new Demo1();
//    	 System.out.println(D1.a);
//    	 D1.m1();
//     }
 //example3       

	
	
	
}
