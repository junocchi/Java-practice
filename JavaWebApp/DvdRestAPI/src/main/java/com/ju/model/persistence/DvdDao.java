package com.ju.model.persistence;

import java.util.List;

import com.ju.dto.entity.Dvd;

public interface DvdDao {

	public Dvd getRecordById(int id);

	public List<Dvd> getAllRecords();
}
