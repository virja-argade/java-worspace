package jdbc_demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class updatedata 
{
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b19","root","Morya@2143");
	 
		String query="update employee set addr=? where id=?";
		PreparedStatement ps=connection.prepareStatement(query);
	    ps.setString(1, "pune");
	    ps.setInt(2, 102);
	    int executeUpdate= ps.executeUpdate();
	    System.out.println(executeUpdate);
	    connection.close();
}

}
	

