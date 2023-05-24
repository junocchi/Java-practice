/*
 * Model ice cream as if the class were to be part of the control system at the
 * dairy that makes the ice cream. Model ice cream as if the class were to be
 * part of the stocking system at a grocery store.
 */

package com.juliana.modeling;

public class IceCream {

	private String flavour;
	private double sizeInMililiters;
	private int batchCode;
	private int expirationDate;

	// grocery store
	private String productName;
	private String companyName;
	private double price;
	private int quantity;

	// constructor
	public IceCream(String flavour, double sizeInMililiters, int batchCode, int expirationDate, String productName,
			String companyName, double price, int quantity) {
		super();
		this.flavour = flavour;
		this.sizeInMililiters = sizeInMililiters;
		this.batchCode = batchCode;
		this.expirationDate = expirationDate;
		this.productName = productName;
		this.companyName = companyName;
		this.price = price;
		this.quantity = quantity;
	}

	// getters and setters
	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getSizeInMililiters() {
		return sizeInMililiters;
	}

	public void setSizeInMililiters(double sizeInMililiters) {
		this.sizeInMililiters = sizeInMililiters;
	}

	public int getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}

	public int getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

/*
 * Next: Determine what behaviors the class should have and then define (do not
 * implement) the methods associated with each behavior. Be prepared to explain
 * the reasons behind all of your design decisions.
 */