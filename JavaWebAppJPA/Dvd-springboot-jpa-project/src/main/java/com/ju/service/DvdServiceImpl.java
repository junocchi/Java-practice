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

	// GET by iD
	@Override
	public Dvd searchDvdById(int id) {
		Dvd dvd = dvdDao.findById(id).orElse(null);
		return dvd;
	}

	// GET all
	@Override
	public List<Dvd> getAllDvds() {
		return dvdDao.findAll();
	}

	@Override
	public Dvd insertDvd(Dvd dvd) {
		// save = save or update
		if (searchDvdById(dvd.getDvdId()) == null)
			return dvdDao.save(dvd);
		else
			return null;
	}

	@Override
	public Dvd deleteDvdById(int dvdId) {
		Dvd dvd = searchDvdById(dvdId);
		if (dvd != null)
			dvdDao.deleteById(dvdId);
		return dvd;
	}

	@Override
	public Dvd updateDvdUserRating(int dvdId, int updateUserRating) {
		Dvd dvd = searchDvdById(dvdId);
		if (dvd != null) {
			dvd.setUserRating(dvd.getUserRating() + updateUserRating);
			dvdDao.save(dvd);
		}
		return dvd;
	}
}
