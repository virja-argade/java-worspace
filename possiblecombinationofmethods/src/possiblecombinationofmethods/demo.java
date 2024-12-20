package possiblecombinationofmethods;

import java.util.Scanner;

public class demo {
    
public int twonoadd() {
	Scanner Sc = new Scanner(System.in);
	System.out.println("enter first no");
	int a = Sc.nextInt();
	System.out.println("enter second no");
	int b = Sc.nextInt();
	int c = a + b;
	
	return c;
	//System.out.println(c);
	
}
  public static void main(String[]args) {
	  demo d = new demo();
	  System.out.println("Addition of both number is "+d.twonoadd());
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}