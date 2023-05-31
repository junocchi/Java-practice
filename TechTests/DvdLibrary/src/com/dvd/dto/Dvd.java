package com.dvd.dto;

public class Dvd {

	private String title;
	private String releaseDate;
	private String ratingMPAA;
	private String directorsName;
	private String studio;
	private String notes;

	public Dvd() {

	}

	public Dvd(String title, String releaseDate, String ratingMPAA, String directorsName, String studio, String note) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.ratingMPAA = ratingMPAA;
		this.directorsName = directorsName;
		this.studio = studio;
		this.notes = notes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getRatingMPAA() {
		return ratingMPAA;
	}

	public void setRatingMPAA(String ratingMPAA) {
		this.ratingMPAA = ratingMPAA;
	}

	public String getDirectorsName() {
		return directorsName;
	}

	public void setDirectorsName(String directorsName) {
		this.directorsName = directorsName;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String note) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "DVD [title=" + title + ", releaseDate=" + releaseDate + ", ratingMPAA=" + ratingMPAA
				+ ", directorsName=" + directorsName + ", studio=" + studio + ", notes=" + notes + "]";
	}

}
