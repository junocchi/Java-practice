package com.ju.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.ju.dto.entity.Share;

public class ShareRowMapper implements RowMapper<Share> {

	@Override
	public Share mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Share share = new Share();

		share.setShareId(resultSet.getInt("SHAREID"));
		share.setShareName(resultSet.getNString("SHARENAME"));
		share.setMarketPrice(resultSet.getDouble("MARKETPRICE"));

		return share;
	}
}
