package com.ju.service;

import java.util.List;

import com.ju.dto.entity.Dvd;

public interface DvdService {
	public Dvd searchDvdById(int id);

	public List<Dvd> getAllDvds();

	public Dvd insertDvd(Dvd dvd);

	public Dvd deleteDvdById(int id);

	public Dvd updateDvdUserRating(int id, int userRating);

}
