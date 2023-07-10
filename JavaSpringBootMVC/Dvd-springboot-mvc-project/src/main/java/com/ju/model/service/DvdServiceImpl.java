package com.ju.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ju.dto.entity.Dvd;
import com.ju.model.persistence.DvdDao;

@Service
public class DvdServiceImpl implements DvdService {

	@Autowired
	private DvdDao dvdDao;

	// GET by iD
	@Override
	public Dvd getDvdById(int dvdId) {
		return dvdDao.findById(dvdId).orElse(null);
	}

	// GET all
	@Override
	public List<Dvd> getAllDvds() {
		return dvdDao.findAll();
	}

	// Add a DVD
	@Override
	public boolean addDvd(Dvd dvd) {
		// save = save or update
		try {
			if (dvdDao.insertDvd(dvd.getDvdId(), dvd.getTitle(), dvd.getMpaaRating(), dvd.getDirectorName(),
					dvd.getStudio(), dvd.getUserRating()) > 0)
				return true;
		} catch (Exception ex) {
			return false;
		}
		return false;
	}

	// Delete a DVD by ID
	@Override
	public boolean deleteDvdById(int dvdId) {
		Dvd dvd = getDvdById(dvdId);
		if (dvd != null) {
			dvdDao.deleteById(dvdId);
			return true;
		}
		return false;
	}

	// Update User Rating
	@Override
	public boolean updateDvdUserRating(int dvdId, int updateUserRating) {
		Dvd dvd = getDvdById(dvdId);
		if (dvd != null) {
			dvd.setUserRating(dvd.getUserRating() + updateUserRating);
			dvdDao.save(dvd);
			return true;
		}
		return false;
	}

	// GET Dvd by Title
	@Override
	public boolean getDvdByTitle(String parameter) {
		// TODO Auto-generated method stub
		return false;
	}
}
