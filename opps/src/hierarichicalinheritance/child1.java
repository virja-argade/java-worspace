package hierarichicalinheritance;

public class child1 extends parent {
  public void m2() {
	  System.out.println("m2 method of child1 class");
  } 
  public static void main(String[] args) {
		
		child1 c1=new child1();
		c1.m1();
		c1.m2();
	}  
  
}
