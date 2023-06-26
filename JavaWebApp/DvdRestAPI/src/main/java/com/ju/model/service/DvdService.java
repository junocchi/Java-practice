package com.ju.model.service;

import java.util.List;

import com.ju.dto.entity.Dvd;

public interface DvdService {
	public Dvd searchDvdById(int id);

	public List<Dvd> getAllDvds();
}
