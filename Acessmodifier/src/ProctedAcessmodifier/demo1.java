package ProctedAcessmodifier;

public class demo1 {
	protected int a = 54;

	protected void m1() {
		System.out.println("m1 method of Demo1 class");
	}
	
	public static void main(String[] args) {
		
		demo1 d1=new demo1();
		System.out.println(d1.a);
		d1.m1();
	}
	
	}

