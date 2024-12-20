package ArrayDecleration;

public class booleantypearry {
  public static void main (String[]args) {
	  boolean b[]=new boolean[3];
	  b[0]=true;
	  b[1]=false;
	  b[2]=true;
	  for (int i = 0;i< b.length;i++) {
		  System.out.println (b[i]);
		  
			  
		  }
		  for(boolean c:b) {
			  System.out.println(c);
		  }
		  
	  }
  }

