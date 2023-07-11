package com.ju.model.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ju.dto.entity.Share;

@Repository
public class ShareDaoImpl implements ShareDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Share getRecordById(int id) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM ShareService WHERE ShareId=?", new ShareRowMapper(), id);
		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
	}

	@Override
	public List<Share> getAllRecords() {
		return jdbcTemplate.query("SELECT * FROM ShareService", new ShareRowMapper());
	}

}
