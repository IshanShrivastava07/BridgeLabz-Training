package com.jdbc.employeemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/MyDB?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

	private static final String USER = "root";
	private static final String PASSWORD = "Frustum@7#"; // change if needed

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
