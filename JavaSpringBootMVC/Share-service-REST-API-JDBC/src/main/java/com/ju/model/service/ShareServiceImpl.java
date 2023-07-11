package com.ju.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ju.dto.entity.Share;
import com.ju.model.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao shareServiceDao;
	
	@Override
	public Share searchShareNameById(int id) {
		return shareServiceDao.getRecordById(id);
	}

	@Override
	public List<Share> getAllShares() {
		return shareServiceDao.getAllRecords();
	}

}
