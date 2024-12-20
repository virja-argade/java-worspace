package singleinheritance;

public class child  extends parent{
	public void m2() {
		System.out.println("m2 method of Child class");
	}
     public static void main(String[]args) {
    	parent p = new parent();
    	p.m1();
    	
    	child c = new child();
    	c.m2();
    	
    	parent p1 = new child();
    	p1.m1();
    	 
    	 
    	 
    	 
    	 
     }
}
