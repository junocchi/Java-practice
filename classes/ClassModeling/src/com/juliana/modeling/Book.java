package com.juliana.modeling;

public class Book {

	// publishing system to write books
	private String alignmentType;
	private String fontType;
	private String genre;
	private double fontSize;
	private int chapterNumber;
	private boolean statusSaved;

	// library cataloguing system
	private String title;
	private String author;
	private String publishingCompany;
	private String ISBN;
	private int publishingYear;
	private int numPages;

	// constructor
	public Book(String alignmentType, String fontType, String genre, double fontSize, int chapterNumber,
			boolean statusSaved, String title, String author, String publishingCompany, String iSBN, int publishingYear,
			int numPages) {
		super();
		this.alignmentType = alignmentType;
		this.fontType = fontType;
		this.genre = genre;
		this.fontSize = fontSize;
		this.chapterNumber = chapterNumber;
		this.statusSaved = statusSaved;
		this.title = title;
		this.author = author;
		this.publishingCompany = publishingCompany;
		ISBN = iSBN;
		this.publishingYear = publishingYear;
		this.numPages = numPages;
	}

	// getters and setters
	public String getAlignmentType() {
		return alignmentType;
	}

	public void setAlignmentType(String alignmentType) {
		this.alignmentType = alignmentType;
	}

	public String getFontType() {
		return fontType;
	}

	public void setFontType(String fontType) {
		this.fontType = fontType;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getFontSize() {
		return fontSize;
	}

	public void setFontSize(double fontSize) {
		this.fontSize = fontSize;
	}

	public int getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(int chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public boolean isStatusSaved() {
		return statusSaved;
	}

	public void setStatusSaved(boolean statusSaved) {
		this.statusSaved = statusSaved;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

}

/*
 * Model a book as if the class were to be part of a publishing system that the
 * author uses to write the book. Model a book as if the class were to be part
 * of a library cataloguing system.
 */

/*
 * Do the following for each class:
 * 
 * Define properties; determine which will be read/write and which will be
 * read-only. Implement setters and getters (as appropriate) for each property.
 * Implement a constructor to initialize some or all of the property values.
 * Determine what behaviors the class should have and then define (do not
 * implement) the methods associated with each behavior. Be prepared to explain
 * the reasons behind all of your design decisions.
 */