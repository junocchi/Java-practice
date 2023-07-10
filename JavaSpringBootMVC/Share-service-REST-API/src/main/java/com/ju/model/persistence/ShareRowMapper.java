package com.ju.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.ju.dto.entity.Share;

public class ShareRowMapper implements RowMapper<Share> {

	@Override
	public Share mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Share shareService = new Share();

		shareService.setShareId(resultSet.getInt("SHAREID"));
		shareService.setShareName(resultSet.getNString("SHARENAME"));
		shareService.setMarketPrice(resultSet.getDouble("MARKETPRICE"));

		return shareService;
	}
}
