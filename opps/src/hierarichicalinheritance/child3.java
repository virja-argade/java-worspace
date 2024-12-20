package hierarichicalinheritance;

public class child3 extends child2 {
  public void m1() {
	  System.out.println("m1 method of parent class");
	  		
  }
  public void m3() {
		System.out.println("m3 method of Child2 class");
	}
	
	public static void main(String[] args) {
		
		child2 c2=new child2();
		c2.m1();
		c2.m3();
	}
}
