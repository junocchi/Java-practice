package com.ju.model.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ju.dto.entity.Dvd;

@Repository
public class DvdDaoImpl implements DvdDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Dvd getRecordById(int id) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM DVD WHERE DVDID=?", new DvdRowMapper(), id);
		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
	}

	@Override
	public List<Dvd> getAllRecords() {

		return jdbcTemplate.query("SELECT * FROM DVD", new DvdRowMapper());
	}

}
