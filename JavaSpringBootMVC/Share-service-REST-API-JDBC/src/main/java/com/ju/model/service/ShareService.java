package com.ju.model.service;

import java.util.List;

import com.ju.dto.entity.Share;

public interface ShareService {
	
	public Share searchShareNameById(int id);

	public List<Share> getAllShares();
}
