package addition;
import java.util.Scanner;

   
public class twonoaddition {
   public static void main (String[]args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter first number");
	   int a = sc.nextInt();
	   System.out.println("enter the second number");
	   int b = sc.nextInt();
	   
	   int c = a + b;
	   System.out.println(c);
   }
   
}
