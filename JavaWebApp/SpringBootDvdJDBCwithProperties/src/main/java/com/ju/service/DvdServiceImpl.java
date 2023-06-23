package com.ju.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ju.entity.Dvd;
import com.ju.persistence.DvdDao;
import com.ju.persistence.DvdDaoImpl;

@Service("dvdService")
public class DvdServiceImpl implements DvdService {

	private DvdDao dvdDao;
	
	public DvdServiceImpl(@Autowired DvdDao dvdDao) {
		super();
		this.dvdDao = dvdDao;
	}

	// choice 1
	@Override
	public boolean addDvd(Dvd dvd) {
		return dvdDao.addRecord(dvd) > 0;
	}

	// choice 2 - 
	@Override
	public boolean deleteDvdById(int id) {
		return dvdDao.deleteRecord(id)>0;
	}

	// choice 3 - 
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