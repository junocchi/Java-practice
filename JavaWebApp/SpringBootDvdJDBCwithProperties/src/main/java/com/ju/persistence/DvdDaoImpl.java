package com.ju.persistence;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ju.entity.Dvd;

@Repository("dvdDao")
public class DvdDaoImpl implements DvdDao {
	Connection connection = null;
	PreparedStatement preparedStatement;

	public void connectToDataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WileyDI004", "root", "root-Juli-23");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// Get all records - choice 1
	@SuppressWarnings("finally")
	@Override
	public List<Dvd> getAllRecords() {
		List<Dvd> dvdList = new ArrayList<Dvd>();
		try {

			connectToDataBase();
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
		try {
			connectToDataBase();
			preparedStatement = connection.prepareStatement("INSERT INTO DVD VALUES(?,?,?,?,?,?)");

			preparedStatement.setInt(1, dvd.getDvdID());
			preparedStatement.setString(2, dvd.getTitle());
			preparedStatement.setInt(3, dvd.getMpaaRating());
			preparedStatement.setString(4, dvd.getDirectorName());
			preparedStatement.setString(5, dvd.getStudio());
			preparedStatement.setInt(6, dvd.getUserRating());

			int rows = preparedStatement.executeUpdate();

			return rows;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;

	}

	// Delete a record
	@Override
	public int deleteRecord(int id) {
		try {
			connectToDataBase();
			preparedStatement = connection.prepareStatement("DELETE FROM DVD WHERE DvdID=?");
			preparedStatement.setInt(1, id);
			int rows = preparedStatement.executeUpdate();
			return rows;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	// Update a record (user rating)
	@Override
	public int updateRecord(int id, int newRating) {
		try {
			connectToDataBase();
			String query = "UPDATE DVD SET UserRating=" + newRating + " where DvdID=" + id;
			preparedStatement = connection.prepareStatement(query);

			int rows = preparedStatement.executeUpdate();
			System.out.println(rows);
			return rows;

		} catch (SQLException e) {
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
		return 0;
	}

}