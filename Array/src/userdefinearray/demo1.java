package userdefinearray;

import java.util.Scanner;

public class demo1 {
	
	public static void main(String[]args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size of array");
     int Size=sc.nextInt();
     String arr[]=new String[Size];
     System.out.println("enter array elements");
	
	for(int i=0;i<arr.length;i++) {  
		 arr[i]=sc.next();
	}
	System.out.println("printing array element using for loop");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	}
   System.out.println("printing array elements using for each loop");
   for(String a:arr) {
	   System.out.println(a);
   }
}
}