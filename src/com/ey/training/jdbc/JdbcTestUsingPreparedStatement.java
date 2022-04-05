package com.ey.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTestUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dblearning", "root", "root");

//		PreparedStatement ps = connection.prepareStatement("select * from dblearning.employee where id = ?");
//
//		ps.setInt(1, 6);
//
//		ResultSet resultSet = ps.executeQuery();
//
//		while(resultSet.next()) {
//			System.out.println(resultSet.getInt("id") + " - "+resultSet.getString("emp_First_name")+
//					" - "+resultSet.getString("emp_last_name") +
//					" - "+resultSet.getString("address")+
//					" - "+resultSet.getInt("contact_number"));
//
//		}

		PreparedStatement ps2 = connection.prepareStatement("insert into dblearning.employee(id,emp_First_name,emp_last_name) values(?,?,?)");
		ps2.setInt(1, 21);
		ps2.setString(2, "python");
		ps2.setString(3, "da");
		
		int i = ps2.executeUpdate();
		
		System.out.println("data stored in db");
		
		connection.close();
		
	}

}
