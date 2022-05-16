package com.internship.project.database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



public class Database {

	private static String url = "jdbc:postgresql://localhost/inventory";
	private static String user = "inventory_user";
	private static String password = "inventory_pwd";

	private Database() {

	}

	public static Connection getConnection() throws SQLException {
		Connection connection = null;
		connection = DriverManager.getConnection(url, user, password);

		return connection;
	}
}
