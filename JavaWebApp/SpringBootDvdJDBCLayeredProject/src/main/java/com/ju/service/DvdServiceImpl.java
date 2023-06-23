package com.ju.service;

import java.util.LinkedList;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ju.entity.Dvd;
import com.ju.persistence.DvdDao;
import com.ju.persistence.DvdDaoImpl;

@Service("dvdService")
public class DvdServiceImpl implements DvdService {

	private DvdDao dvdDao;
	//private LinkedList<Dvd> dvdList;
	
	

	public DvdServiceImpl(@Autowired DvdDao dvdDao) {
		super();
		this.dvdDao = dvdDao;
	}

	// choice 1
	@Override
	public boolean addDvd(Dvd dvd) {
		return dvdDao.addRecord(dvd) > 0;
	}

	// choice 3
	@Override
	public Dvd findDvdByTitle(String title) {
//		for (Dvd dvd : dvdList) {
//			if (dvd.getTitle().equals(title))
//				return dvd;
//		}
		return null;
	}
	
	// choice 3
	@Override
	public List<Dvd> getAllDvds() {
		return dvdDao.getAllRecords();
	}

}