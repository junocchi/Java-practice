package com.service;

import java.util.List;
import com.entity.Dvd;

public interface DvdService {

	List<Dvd> getAllDvds();

	boolean addDvd(Dvd dvd);

	boolean deleteDvdById(int dvdID);
	
	boolean editDvd(String title);

	Dvd findDvdByTitle(String title);

	
}
