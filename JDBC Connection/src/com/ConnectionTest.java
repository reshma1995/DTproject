package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			 con =DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			 System.out.println(" connection done");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
		 st=con.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
  		
		try {
			st.execute(" insert into student values(10,'abc')");  // insertion
			System.out.println(" inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs=null;
		try {
			rs = st.executeQuery("select * from student");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(rs.next())
			{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));// fetching 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*finally
		{
			try {
				con.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}*/
	}
	
	
	
}
