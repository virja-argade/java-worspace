package parametarizedconstroctor;

public class example2 {
	String n;
	String s;
	int a;
	example2(String name,String sport,int age){
		n = name;
		s = sport;	
		a = age;
		System.out.println("my name is"+name );
		System.out.println("my favorite sport is" +sport);
		System.out.println("i am "+age+"yearsold");
		}
	
	public static void main(String[]args) {
		example2 myObj= new example2("virija","cricket",23);
}

}
