package com.ju.dto.entity;

public class Share {
	private int shareId;
	private String shareName;
	private double marketPrice;

	public Share() {
		super();
	}

	public Share(int shareId, String shareName, double marketPrice) {
		super();
		this.shareId = shareId;
		this.shareName = shareName;
		this.marketPrice = marketPrice;
	}

	public int getShareId() {
		return shareId;
	}

	public void setShareId(int shareId) {
		this.shareId = shareId;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	@Override
	public String toString() {
		return "ShareService [shareId=" + shareId + ", shareName=" + shareName + ", marketPrice=" + marketPrice + "]";
	}

}
