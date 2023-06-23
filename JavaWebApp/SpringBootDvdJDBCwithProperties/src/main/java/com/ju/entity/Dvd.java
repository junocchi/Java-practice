package com.ju.entity;

public class Dvd {

	public Dvd() {
		// TODO Auto-generated constructor stub
	}

	private int dvdID;
	private String title;
	private int mpaaRating;
	private String directorName;
	private String studio;
	private int userRating;

	public Dvd(int dvdID, String title, int mpaaRating, String directorName, String studio, int userRating) {
		super();
		this.dvdID = dvdID;
		this.title = title;
		this.mpaaRating = mpaaRating;
		this.directorName = directorName;
		this.studio = studio;
		this.userRating = userRating;
	}

	public int getDvdID() {
		return dvdID;
	}

	public void setDvdID(int dvdID) {
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
