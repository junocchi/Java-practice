package com.ju.dto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DVDJPA")
public class Dvd {

	@Id
	@Column(name = "DvdId")
	private int dvdID;
	@Column(name = "Title", length = 30)
	private String title;
	@Column(name = "MpaaRating")
	private int mpaaRating;
	@Column(name = "DirectorName", length = 30)
	private String directorName;
	@Column(name = "Studio", length = 30)
	private String studio;
	@Column(name = "UserRating")
	private int userRating;

	public Dvd() {

	}

	public Dvd(int dvdID, String title, int mpaaRating, String directorName, String studio, int userRating) {
		super();
		this.dvdID = dvdID;
		this.title = title;
		this.mpaaRating = mpaaRating;
		this.directorName = directorName;
		this.studio = studio;
		this.userRating = userRating;
	}

	public int getDvdId() {
		return dvdID;
	}

	public void setDvdId(int dvdID) {
		this.dvdID = dvdID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMpaaRating() {
		return mpaaRating;
	}

	public void setMpaaRating(int mpaaRating) {
		this.mpaaRating = mpaaRating;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	@Override
	public String toString() {
		return "Dvd [dvdID=" + dvdID + ", title=" + title + ", mpaaRating=" + mpaaRating + ", directorName="
				+ directorName + ", studio=" + studio + ", userRating=" + userRating + "]";
	}

}