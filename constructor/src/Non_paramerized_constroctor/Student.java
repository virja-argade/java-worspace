package Non_paramerized_constroctor;

public class Student {
	String  name ;
	int age;
	 
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		
	}

   Student(){
	   System.out.println("constroctor called");
   }
	   
   public class opps{
	   public static void main (String[]args) {
     Student s1 = new Student();
     s1.name = "virija";
     s1 age= 26;
     
     s1.printinfo();
		   
		   
	   }

	
		
	}
   }
   
