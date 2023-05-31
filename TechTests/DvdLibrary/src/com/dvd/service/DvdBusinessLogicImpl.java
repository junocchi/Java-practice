package com.dvd.service;

import java.util.LinkedList;
import com.dvd.persistence.*;
import com.dvd.dto.Dvd;

public class DvdBusinessLogicImpl implements DvdBusinessLogic {

	private DvdDataAccess dataAccess = new DvdDataAccessImpl();

	private LinkedList<Dvd> dvdList;

	public DvdBusinessLogicImpl() {
		try {
			dvdList = dataAccess.readRecords();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addDvd(Dvd dvd) {

		return dvdList.add(dvd);
	}

	@Override
	public boolean deleteDvd(String title) {
		for (Dvd dvd : dvdList) {
			if (title.equals(dvd.getTitle()))
				return dvdList.remove(dvd);
		}
		return false;
	}

	@Override
	public boolean editDvd(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LinkedList<Dvd> getAllDvds() {

		return dvdList;
	}

	@Override
	public LinkedList<Dvd> getDvd(String title) {
//		for(Dvd dvd:dvdList) {
//			if(title==dvd.getTitle())
//				return dvd;
//		}
		return null;
	}

	@Override
	public Dvd findDvdByTitle(String title) {
		for (Dvd dvd : dvdList) {
			if (dvd.getTitle().equals(title))
				return dvd;
		}
		return null;
	}

	@Override
	public void saveAllDvds() {
		// TODO Auto-generated method stub
		
	}

}
