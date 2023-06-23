package com.persistence;

import java.util.List;

import com.entity.Dvd;

public interface DvdDao {
	List<Dvd> getAllRecords();
	int addRecord(Dvd dvd);
	int deleteRecord(int id);
	int updateRecord(int id, int newRating);
}