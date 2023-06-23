package com.persistence;

import java.util.List;

import com.entity.Dvd;

public interface DvdDao {
	List<Dvd> getAllRecords();

	int addRecord(Dvd dvd);

	int deleteRecord(int dvdID);

	int updateRecord(int dvdID, int newRating);
}