package com.dvd.library;

public class DvdLibrary {

	private String title;
	private String relDate;
	private String rating;
	private String director;
	private String studio;
	private String notes;

	public DvdLibrary(String title, String relDate, String rating, String director, String studio, String notes) {
		super();
		this.title = title;
		this.relDate = relDate;
		this.rating = rating;
		this.director = director;
		this.studio = studio;
		this.notes = notes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRelDate() {
		return relDate;
	}

	public void setRelDate(String relDate) {
		this.relDate = relDate;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
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

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "DvdLibrary [title=" + title + ", relDate=" + relDate + ", rating=" + rating + ", director=" + director
				+ ", studio=" + studio + ", notes=" + notes + "]";
	}

}
