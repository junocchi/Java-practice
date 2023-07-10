package com.ju.model.service;

import java.util.List;
import com.ju.dto.entity.Dvd;

public interface DvdService {
	
	public Dvd getDvdById(int id);
	
	//public Dvd getDvdByTitle(String title);

	public List<Dvd> getAllDvds();

	public boolean deleteDvdById(int id);
	
	public boolean addDvd(Dvd dvd);

	public boolean updateDvdUserRating(int id, int userRating);

}