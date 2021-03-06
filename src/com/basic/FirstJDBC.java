package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstJDBC {
	public FirstJDBC() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "select * from employee";
			resultSet = statement.executeQuery(sql);
			System.out.println(statement);
			System.out.println(resultSet);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("empid") + " ");
				System.out.println(resultSet.getString("name") + " ");
				System.out.println(resultSet.getString(3) + " ");
				System.out.println(resultSet.getString("salary") + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		FirstJDBC first = new FirstJDBC();
	}

}
