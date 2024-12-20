package ststicblock;

public class Staticclass {
    static {
    	System.out.println("Static Block-1");
    	
    }
    
    public static void main(String[]args) {
    	System.out.println("main method");
    }
    static {
    	System.out.println("static block-2");
    }
}
