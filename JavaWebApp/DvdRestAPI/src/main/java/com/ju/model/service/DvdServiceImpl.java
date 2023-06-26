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

	@Override
	public Dvd searchDvdById(int id) {
		return dvdDao.getRecordById(id);
	}

	@Override
	public List<Dvd> getAllDvds() {
		return dvdDao.getAllRecords();
	}
}
