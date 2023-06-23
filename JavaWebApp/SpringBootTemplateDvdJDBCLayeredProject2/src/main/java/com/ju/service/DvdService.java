package com.ju.service;

import java.util.List;

import com.ju.entity.Dvd;

public interface DvdService {

	List<Dvd> getAllDvds();

	boolean addDvd(Dvd dvd);


	Dvd findDvdByTitle(String title);

	
}
