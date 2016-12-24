package com.mbc.minibanking.bl;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MgrCustomer {
	 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=MBCDB@dmin12;database=MiniBanking");
		System.out.println("test");
		Statement sta = conn.createStatement();
		String Sql = "select * from Customer";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString("Customer_Name"));
		}
	}
	
	public String customer() throws SQLException,ClassNotFoundException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=MBCDB@dmin12;database=MiniBanking");
		System.out.println("test");
		Statement sta = conn.createStatement();
		String Sql = "select * from Customer";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString("Customer_Name"));
		}
		return rs.getString("Customer_Name");
	}
}
