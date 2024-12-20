package superkeyword;

public class child extends parent {
	int a = 90;
	public void print() {
		 System.out.println(a);
		 System.out.println(super.a);
		 
	}
	
      public static void main(String[]args) {
    	  child c = new child();
    	  c.print();
      }
}
