package com.service;

import java.util.LinkedList;
import java.util.List;
import com.entity.Dvd;
import com.persistence.DvdDao;
import com.persistence.DvdDaoImpl;

public class DvdServiceImpl implements DvdService {

	private DvdDao dvdDao;

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
	public boolean editDvd(String title) {
		return dvdDao.updateRecord(UserRating, Title)>0;

	}
	
	@Override
	public Dvd findDvdByTitle(String title) {
		for (Dvd dvd : dvdList) {
			if (dvd.getTitle().equals(title))
				return dvd;
		}
		return null;
	}
	
	// choice 4
	@Override
	public List<Dvd> getAllDvds() {
		return dvdDao.getAllRecords();
	}

}