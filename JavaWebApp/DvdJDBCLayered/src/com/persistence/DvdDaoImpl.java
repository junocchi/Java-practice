package com.persistence;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.entity.Dvd;

public class DvdDaoImpl implements DvdDao {

	// Get all records - choice 1
	@Override
	public List<Dvd> getAllRecords() {
		Connection connection = null;
		PreparedStatement preparedStatement;
		List<Dvd> dvdList = new ArrayList<Dvd>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WileyDI004", "root", "root-Juli-23");

			preparedStatement = connection.prepareStatement("SELECT * FROM DVD");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int dvdId = resultSet.getInt("DvdID");
				String title = resultSet.getString("Title");
				int mpaaRating = resultSet.getInt("MPAArating");
				String directorName = resultSet.getString("DirectorName");
				String studio = resultSet.getString("Studio");
				int userRating = resultSet.getInt("UserRating");

				Dvd dvd = new Dvd(dvdId, title, mpaaRating, directorName, studio, userRating);
				dvdList.add(dvd);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return dvdList;
		}
	}

	// Add a record - choice 2
	@Override
	public int addRecord(Dvd dvd) {
		Connection connection = null;
		PreparedStatement preparedStatement;
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WileyDI004", "root", "root-Juli-23");

			preparedStatement = connection.prepareStatement("INSERT INTO DVD VALUES(?,?,?,?,?,?)");

			preparedStatement.setInt(1, dvd.getDvdID());
			preparedStatement.setString(2, dvd.getTitle());
			preparedStatement.setInt(3, dvd.getMpaaRating());
			preparedStatement.setString(4, dvd.getDirectorName());
			preparedStatement.setString(5, dvd.getStudio());
			preparedStatement.setInt(6, dvd.getUserRating());

			int rows = preparedStatement.executeUpdate();

			return rows;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			return 0;
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	// Delete record
	@Override
	public int deleteRecord(int dvdID) {
		Connection connection = null;
		PreparedStatement preparedStatement;
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WileyDI004", "root", "root-Juli-23");

			preparedStatement = connection.prepareStatement("DELETE FROM DVD WHERE EMPID=?");

			preparedStatement.setInt(1, dvdID);

			int rows = preparedStatement.executeUpdate();

			return rows;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			return 0;
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}
}