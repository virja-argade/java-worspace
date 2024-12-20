package jdbc_demo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class MySQLConnectionExample {
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/b19"; 
	        String username = "root"; 
	        String password = "Morya@2143"; 

	        try (Connection connection = DriverManager.getConnection(url, username, password)) {
	            System.out.println("Connected to the database successfully!");
	        } catch (SQLException e) {
	            System.out.println("Error connecting to the database: " + e.getMessage());
	        }
	    }
	}



