package com.ju.model.persistence;

import java.util.List;
import com.ju.dto.entity.Share;

public interface ShareDao {
	public Share getRecordById(int id);

	public List<Share> getAllRecords();
}
