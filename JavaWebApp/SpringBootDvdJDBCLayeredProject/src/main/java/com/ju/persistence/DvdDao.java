package com.ju.persistence;

import java.util.List;

import com.ju.entity.Dvd;

public interface DvdDao {

	List<Dvd> getAllRecords();
	int addRecord(Dvd dvd);
}