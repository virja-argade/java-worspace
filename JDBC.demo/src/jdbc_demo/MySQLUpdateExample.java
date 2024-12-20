package jdbc_demo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class MySQLUpdateExample {
	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/b19"; 
	        String username = "root"; 
	        String password = "Morya@2143"; 

	        String updateQuery = "UPDATE employee SET salary =50000  WHERE id = 101"; 

	        try (Connection connection = DriverManager.getConnection(url, username, password);
	             PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

	            
	            preparedStatement.setDouble(1, 500000); 
	            preparedStatement.setInt(2, 101); 

	            
	            int  rowsAffected = preparedStatement.executeUpdate();

	            if (rowsAffected > 1) {
	                System.out.println("Update successful! Rows affected: " + rowsAffected);
	            } else {
	                System.out.println("No rows were updated.");
	            }

	        } catch (SQLException e) {
	            System.out.println("Error occurred while updating data: " + e.getMessage());
	        }
	    }
	}


