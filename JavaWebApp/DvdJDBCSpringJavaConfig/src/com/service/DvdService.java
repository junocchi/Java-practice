package com.service;

import java.util.List;

import com.entity.Dvd;

public interface DvdService {

	boolean addDvd(Dvd dvd);

	boolean deleteDvdById(int dvdID);
	
	boolean updateRating(int id,int newRating);

	List<Dvd> getAllDvds();
}
