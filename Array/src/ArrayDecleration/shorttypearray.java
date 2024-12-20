package ArrayDecleration;

public class shorttypearray {
  public static void main (String[]args) {
	  short arr[]= {34,45,44,};
	  for(int i= 0;i< arr.length;i++){
		  System.out.println(arr[i]);
		  
		 //for each loop
		  for(short c: arr) {
			  System.out.println(c);
		  }
	  }
  }
}
