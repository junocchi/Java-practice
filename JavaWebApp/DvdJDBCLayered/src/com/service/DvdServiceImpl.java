package com.service;

import java.util.List;

import com.entity.Dvd;
import com.persistence.DvdDao;
import com.persistence.DvdDaoImpl;

public class DvdServiceImpl implements DvdService {

	private DvdDao dvdDao = new DvdDaoImpl();

	// choice 1
	@Override
	public boolean addDvd(Dvd dvd) {
		return dvdDao.addRecord(dvd) > 0;
	}

	// choice 2
	@Override
	public List<Dvd> getAllDvds() {
		return dvdDao.getAllRecords();
	}

}