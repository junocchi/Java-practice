package com.service;

import java.util.List;

import com.entity.Dvd;

public interface DvdService {

	List<Dvd> getAllDvds();

	boolean addDvd(Dvd dvd);

}
