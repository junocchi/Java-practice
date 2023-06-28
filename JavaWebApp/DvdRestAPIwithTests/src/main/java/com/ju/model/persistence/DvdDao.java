package com.ju.model.persistence;

import java.util.List;

import com.ju.dto.entity.Dvd;

public interface DvdDao {

	public Dvd getRecordById(int id);

	public List<Dvd> getAllRecords();

	public int saveRecord(Dvd dvd);

	public int deleteRecord(int dvdID);

	public int updateUserRating(int dvdID, int userRating);
}
