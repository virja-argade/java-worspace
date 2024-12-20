package methonover_riding;

public class Splender extends Bike{

	void run() {
		System.out.println("running at 60kmph");
	}
	
	
	public static void main(String[] args) {
		Splender s= new Splender();
		s.run();
		
		Bike b = new Splender();
		b.run();
		
		Bike b1 = new Bike();
		b1.run();
		
//		Splender s1= new Bike();
	}
}
