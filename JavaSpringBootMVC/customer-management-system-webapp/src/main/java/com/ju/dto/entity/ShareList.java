package com.ju.dto.entity;

import java.util.List;

// We create this class to encapsulate the list and be able to return it in our ShareResource
public class ShareList {
	private List<Share> shares;

	public ShareList() {

	}

	public ShareList(List<Share> shares) {
		super();
		this.shares = shares;
	}

	public List<Share> getShares() {
		return shares;
	}

	public void setShares(List<Share> shares) {
		this.shares = shares;
	}

	@Override
	public String toString() {
		return "ShareList [shares=" + shares + "]";
	}

}
