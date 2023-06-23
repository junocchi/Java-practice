package com.persistence;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.entity.Dvd;

@Repository("dvdDao")
public class DvdDaoImpl implements DvdDao {
	Connection connection = null;
	PreparedStatement preparedStatement;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// Get all records - choice 1
	@Override
	public List<Dvd> getAllRecords() {
		String query = "SELECT * FROM DVD";
		return jdbcTemplate.query(query, new DvdMapper());
	}

	// Add a record - choice 2
	@Override
	public int addRecord(Dvd dvd) {
		String query = "INSERT INTO DVD VALUES (?,?,?,?,?,?)";
		return jdbcTemplate.update(query, dvd.getDvdID(), dvd.getTitle(), dvd.getMpaaRating(), dvd.getDirectorName(),
				dvd.getStudio(), dvd.getUserRating());
	}

	// Delete record
	@Override
	public int deleteRecord(int dvdID) {
		String query = "DELETE FROM DVD WHERE DvdID=?";
		return jdbcTemplate.update(query, dvdID);
	}

	// Update record
	@Override
	public int updateRecord(int dvdID, int newRating) {
		String query = "UPDATE DVD SET UserRating=" + newRating + " WHERE DvdID=" + dvdID;
		return jdbcTemplate.update(query);
	}

}