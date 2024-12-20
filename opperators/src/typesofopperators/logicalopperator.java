package typesofopperators;

public class logicalopperator {
   public static void main (String[]args) {
	    
	   int a = 10;
	   int b = 20;
	   
	   System.out.println("logical And opperator");
	   System.out.println((a<b)&&(a<b));
	    System.out.println((a>b)&&(a<b));
	    System.out.println((a<b)&&(a>b));
	    System.out.println((a>b)&&(a>b));
	    
	   
	   System.out.println("logical OR opperator");
	  System.out.println((a<b)||(a>b));
	  System.out.println((a<b)||(a<b));
	  System.out.println((a>b)||(a>b));
	 System.out.println((a>b)||(a<b));
	    
	   System.out.println("logical not opperator");
	   System.out.println(!(a>b));
	   System.out.println(!(a<b));
   }
}
