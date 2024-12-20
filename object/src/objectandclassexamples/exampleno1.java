package objectandclassexamples;

public class exampleno1 {
	 
	public static void main(String[]args) {
    System.out.println("exampleno1");
    Employe emp1  = new Employe();
    System.out.println(emp1 .Name);
    System.out.println(emp1.getname());
    System.out.println("virija inamdar");
    
}
}  
   class Employe{
   String Name = "virija inamdar";
   String getname() {
   return this.Name; 
   }
  void printname() {
	  System.out.println("this.name");
  }
   
   
   
}