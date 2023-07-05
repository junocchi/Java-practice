package com.ju.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ju.dto.entity.Dvd;
import com.ju.persistence.DvdDao;

@Service
public class DvdServiceImpl implements DvdService {
	@Autowired
	private DvdDao dvdDao;

	@Override
	public Dvd searchDvdById(int id) {
		return dvdDao.getRecordById(id);
	}

	@Override
	public List<Dvd> getAllDvds() {
		return dvdDao.getAllRecords();
	}

	@Override
	public boolean insertDvd(Dvd dvd) {
		return dvdDao.saveRecord(dvd) > 0;
	}

	@Override
	public Dvd deleteDvd(int id) {
		Dvd dvd = searchDvdById(id);

		if (dvd != null)
			dvdDao.deleteRecord(id);

		return dvd;
	}

	@Override
	public Dvd updateDvdUserRating(int id, int userRating) {
		if (dvdDao.updateUserRating(id, userRating) > 0)
			return searchDvdById(id);
		return null;
	}
}
