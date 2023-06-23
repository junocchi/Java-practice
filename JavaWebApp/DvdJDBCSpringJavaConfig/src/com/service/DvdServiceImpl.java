package com.service;

import java.util.List;
import com.entity.Dvd;
import com.persistence.DvdDao;

public class DvdServiceImpl implements DvdService {

	private DvdDao dvdDao;
	
	public DvdServiceImpl(DvdDao dvdDao) {
		super();
		this.dvdDao = dvdDao;
	}

	// choice 1
	@Override
	public boolean addDvd(Dvd dvd) {
		return dvdDao.addRecord(dvd) > 0;
	}

	// choice 2 - not working
	@Override
	public boolean deleteDvdById(int id) {
		return dvdDao.deleteRecord(id)>0;
	}

	// choice 3 - not working
	@Override
	public boolean updateRating(int id, int newRating) {
		return dvdDao.updateRecord(id, newRating)>0;
	}
	
	// choice 4
	@Override
	public List<Dvd> getAllDvds() {
		return dvdDao.getAllRecords();
	}

}