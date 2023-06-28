package com.ju.model.persistence;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.ju.dto.entity.Dvd;

public class DvdRowMapper implements RowMapper<Dvd> {

	@Override
	public Dvd mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Dvd dvd = new Dvd();

		dvd.setDvdID(resultSet.getInt("DVDID"));
		dvd.setTitle(resultSet.getString("TITLE"));
		dvd.setMpaaRating(resultSet.getInt("MPAARATING"));
		dvd.setDirectorName(resultSet.getString("DIRECTORNAME"));
		dvd.setStudio(resultSet.getString("STUDIO"));
		dvd.setUserRating(resultSet.getInt("USERRATING"));

		return dvd;
	}
}
