package hierarichicalinheritance;

public class child2 extends child1 {
	public void m3() {
		System.out.println("m3 method of Child2 class");
	}
	
	public static void main(String[] args) {
		
		child2 c2=new child2();
		c2.m1();
		c2.m3();
	}
}
