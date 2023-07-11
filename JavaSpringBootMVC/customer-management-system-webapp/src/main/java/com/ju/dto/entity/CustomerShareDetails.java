package com.ju.dto.entity;

public class CustomerShareDetails {

	public int detailsId;
	public int customerId;
	public int shareId;
	public String shareType;
	public double quantity;

	public CustomerShareDetails() {
		super();
	}

	public CustomerShareDetails(int detailsId, int customerId, int shareId, String shareType, double quantity) {
		super();
		this.detailsId = detailsId;
		this.customerId = customerId;
		this.shareId = shareId;
		this.shareType = shareType;
		this.quantity = quantity;
	}

	public int getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getShareId() {
		return shareId;
	}

	public void setShareId(int shareId) {
		this.shareId = shareId;
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

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CustomerDetails [detailsId=" + detailsId + ", customerId=" + customerId + ", shareId=" + shareId
				+ ", shareType=" + shareType + ", quantity=" + quantity + "]";
	}

}
