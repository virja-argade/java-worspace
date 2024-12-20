package basicofExceptionHandling;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Main method execution started");


			try {
				FileReader fr= new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\fileHandling\\Demo.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		System.out.println("Main method execution Ended");

	}
}
	

