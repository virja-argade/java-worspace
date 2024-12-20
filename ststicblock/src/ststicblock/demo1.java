package ststicblock;

public class demo1 {
	static {
	     System.out.println("Static Block");
		}
		
		{
			System.out.println("Instance Block");
		}
		public static void main(String[] args) {
		
			Demo d=new Demo();
		}
}
