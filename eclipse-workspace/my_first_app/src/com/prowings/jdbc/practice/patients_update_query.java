package com.prowings.jdbc.practice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class patients_update_query

{

	public static void main(String[] args) {

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management", "root",
					"Shwetatech@8805");

			Statement stmt = con.createStatement();

			String updateQuery = "update patients set address='Pune' where id=3";
			int pt = stmt.executeUpdate(updateQuery);

			if(pt>0)
			{
				System.out.println("Update operation success!!!");
				System.out.println(pt+ " rows affected!!");
			}
			else
				System.out.println("No rows affected!!");
			
			System.out.println("update query: " + pt);

		} catch (ClassNotFoundException e) {
			System.out.println("some error111 occured" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("some error222 occured" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("some error occured" + e.getMessage());
			e.printStackTrace();
		}

		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}