package com.spring.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class app {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String us = "root";
		String pa = "";

		String jdbcUrl = "jdbc:mysql://localhost:3306/team_system";
		String driver = "com.mysql.cj.jdbc.Driver";
		Connection connect = null;
		try {

			Class.forName(driver);

			connect = DriverManager.getConnection(jdbcUrl, us, pa);

			System.out.println("Success");
		} catch (Exception exc) {
			System.out.println("Exception : " + exc.toString());
		} finally {
			connect.close();
		}
	}

}
