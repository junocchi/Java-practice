package com.persistence;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.Dvd;

public class DvdMapper implements RowMapper<Dvd> {

	@Override
	public Dvd mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int id = resultSet.getInt("DvdID");
		String title = resultSet.getString("Title");
		int mpaa = resultSet.getInt("MPAArating");
		String directorName = resultSet.getString("DirectorName");
		String studio = resultSet.getString("Studio");
		int userRating = resultSet.getInt("UserRating");
		Dvd dvd = new Dvd(id, title, mpaa, directorName, studio, userRating);
		return dvd;
	}

}
