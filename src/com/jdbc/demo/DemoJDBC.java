package com.jdbc.demo;

import java.sql.*;

public class DemoJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/logicfirst","root","Arun1994@");
		Statement st = connect.createStatement();
		
		ResultSet rs = st.executeQuery("select * from student");
		
		while(rs.next()) 
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
