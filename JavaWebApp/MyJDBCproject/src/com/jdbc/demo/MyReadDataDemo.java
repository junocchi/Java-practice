package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyReadDataDemo {

	public static void main(String[] args) {
		/*
		 * Steps 1. Register Driver 2. Connect 2.1 Connect to database 2.2
		 * Prepare/Execute Query 3. Processing The result of query 4. Close the
		 * Connection
		 */

		Connection connection = null;
		PreparedStatement preparedStatement;
		try {
//			1.Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			2.Connect
//			2.1 Connect to Database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WileyDI004", "root", "************");
			// 2.2 Prepare/Execute Query
			preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");

			// if you are writing DQL Query then use executeQuery()
			ResultSet resultSet = preparedStatement.executeQuery();

//			3.Process Result
			while (resultSet.next()) {
				int id = resultSet.getInt("Employee_ID");
				String firstName = resultSet.getString("First_Name");
				String lastName = resultSet.getString("Last_Name");
				String email = resultSet.getString("Email");
				double sal = resultSet.getDouble("Salary");
				System.out.println(id + "  " + firstName + "  " + lastName + "  " + email + "  " + sal);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/*
Output:
434  Alan  Sugar  as@gmail.com  20400.0
834  Lila  Wilko  lw@gmail.com  65500.0
1234  Raul  Smith  hj@gmail.com  24500.0
 */ 
