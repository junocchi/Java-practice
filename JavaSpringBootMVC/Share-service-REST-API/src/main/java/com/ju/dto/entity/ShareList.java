package com.ju.dto.entity;

import java.util.List;

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
