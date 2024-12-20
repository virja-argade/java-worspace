package iterativestatement;

import java.util.Scanner;

public class whileloop {
      

	public static void main(String[]args) {
//    	  System.out.println("while loop will be here");
//    	  int item = 0;
//    	  while (item<10) {
//    	 System.out.println(item);
//    	 item++;
//    	 
//    	  }
    	  
    	System.out.println("please enter max valueof loop");  
       Scanner sc = new Scanner( System.in);
       int maxData = sc.nextInt();
       int data = 0;
       while (data<maxData) {
    	   data++;
    	   if(data%2==0) {
    	   System.out.println(data);
    	   
       }
       
    	
    	
    	
      }
	}
}
