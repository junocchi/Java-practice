package com.ju.dto.entity;

public class CustomerDetail {
	private int customerId;
	private String shareName;
	private String shareType;
	private double quantity;
	private double unitPrice;
	private double totalValuation;

	public CustomerDetail(int customerId, String shareName, String shareType, double quantity, double unitPrice,
			double totalValuation) {
		super();
		this.customerId = customerId;
		this.shareName = shareName;
		this.shareType = shareType;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalValuation = totalValuation;
	}

	public CustomerDetail() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public String getShareType() {
		return shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTotalValuation() {
		return totalValuation;
	}

	public void setTotalValuation(double totalValuation) {
		this.totalValuation = totalValuation;
	}

	@Override
	public String toString() {
		return "CustomerDetail [customerId=" + customerId + ", shareName=" + shareName + ", shareType=" + shareType
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalValuation=" + totalValuation + "]";
	}

}
