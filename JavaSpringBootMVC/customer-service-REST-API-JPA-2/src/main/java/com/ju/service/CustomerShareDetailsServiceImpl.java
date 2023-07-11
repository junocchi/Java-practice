package com.ju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ju.dto.entity.CustomerShareDetails;
import com.ju.persistence.CustomerShareDetailsDao;

@Service
public class CustomerShareDetailsServiceImpl implements CustomerShareDetailsService {

	@Autowired
	CustomerShareDetailsDao customerShareDetailsDao;
	
	@Override
	public List<CustomerShareDetails> getCustomerShareDetailsByCustomerId(int customerId) {
		return customerShareDetailsDao.getCustomerByCustomerId(customerId);
		
	}

}