package jdbc_demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLJDBCExample {
    public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
     Connection connection = DriverManager.getConnection("jdbc:mysql//localhost:3306/b19","root","Morya@2143");
  String query = "insert into employee values(101,''aditi,'pune'40000)";
         Statement stmt = connection.createStatement();
         stmt.executeUpdate(query);
         int update = stmt.executeUpdate(query);
         System.out.println(update);
         connection.close();
    }
}
