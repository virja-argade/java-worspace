package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class insertwithpreparestatement {
	private static Object ps;

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b19", "root", "Morya@2143");

//	String query = "insert into employee values(?,?,?,?)";
//		PreparedStatement ps = connection.prepareStatement(query);
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Please enter details");
//		System.out.println("Please enter empid");
//
//		ps.setInt(1, sc.nextInt());
//
//		System.out.println("Please enter name");
//		ps.setString(2, sc.next());
//		System.out.println("Please enter city");
//		ps.setString(3, sc.next());
//		System.out.println("Please enter salary");
//		ps.setInt(4, sc.nextInt());
//
//		int update = ps.executeUpdate();
////        System.out.println(update);
//
//		if (update != 0)
//
//			System.out.println("Record inserted successfully");
//
//		else
//			System.out.println("Please enter valid data");
//		connection.close();
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter details that you want to update");
	System.out.println("enter empid");
	int id = sc.nextInt();
	System.out.println("enter city");
	String city = sc.next();
	System.out.println("enter salary");
	int salary= sc.nextInt();
	
	
	
	String query = "update employee set city=?,salary=? where empid ="+id;
//	String query1= "update employee set where ename="salary;
	PreparedStatement ps = connection.prepareStatement(query);	
	ps.setString(1, city);
	ps.setInt(2, salary);
		
	int update =ps.executeUpdate();
	
	if (update != 0 )
		System.out.println("Record updated successfully!!!!");
	else
		System.out.println("Record not found");
   
	connection.close();
		
	}
}
