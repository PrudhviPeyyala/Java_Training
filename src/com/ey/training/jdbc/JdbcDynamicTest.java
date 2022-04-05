package com.ey.training.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDynamicTest {

	public static void main(String[] args) {

		Connection connection = null;
//		insert into dblearning.employee(id,emp_First_name,emp_last_name,address) values(25,'Prudhvi2','Peyyala2','A2P');
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dblearning", "root", "root");

//			PreparedStatement statement = connection.prepareStatement("insert into dblearning.employee(id,emp_First_name,emp_last_name) values(?,?,?)");
			
//			InputStreamReader reader = new InputStreamReader(System.in);
//			BufferedReader read = new BufferedReader(reader);
//			
//			int id = Integer.parseInt(read.readLine());
//			String name = read.readLine()
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter lname");
			String lname = sc.next();
			
//			statement.setInt(1, id);
//			statement.setString(2, name);
//			statement.setString(3, lname);
//			
//			statement.execute();
			
			Statement statement = connection.createStatement();
			
			String sql = "insert into dblearning.employee(id,emp_First_name,emp_last_name)"
					+ " values("+id+",'"+name+"','"+lname+"')";
			
			statement.execute(sql);
			
			String sql2 = "select * from dblearning.employee where id="+id;
			
			ResultSet rs = statement.executeQuery(sql2);
			
			while(rs.next()) {
				System.out.println("$"+rs.getInt(id) +",#"+rs.getString("emp_First_name")+","+rs.getString("emp_last_name"));
			}
			
			
		}catch(Exception e) {
			System.out.println("error "+ e.getMessage());
		}
	}
}
