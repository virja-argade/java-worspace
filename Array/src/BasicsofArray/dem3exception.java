package BasicsofArray;

public class dem3exception {
//Arry indexoutofbond exception:
	public static void main(String[]args) {
	 int arr[]=new int[5];
	 arr[0]=1;
	 arr[1]=2;
	 arr[2]=3;
	 arr[3]=4;
	 arr[4]=5;
	 try {
	 arr[5]=6;
	 }catch(ArrayIndexOutOfBoundsException a) {
	
	 
	 }
	 
	 System.out.println(arr[0]);
	 System.out.println(arr[1]);
	 System.out.println(arr[2]);
	 System.out.println(arr[3]);
	 System.out.println(arr[4]);
	 System.out.println(arr[5]);
	 System.out.println(arr[6]);
	 
		
	}
	
	
	}
	

	

