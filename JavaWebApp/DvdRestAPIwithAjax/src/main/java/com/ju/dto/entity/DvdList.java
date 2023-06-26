package com.ju.dto.entity;

import java.util.List;

public class DvdList {

	private List<Dvd> dvds;

	public DvdList() {

	}

	public DvdList(List<Dvd> dvds) {
		super();
		this.dvds = dvds;
	}

	public List<Dvd> getDvds() {
		return dvds;
	}

	public void setDvds(List<Dvd> dvds) {
		this.dvds = dvds;
	}

}
