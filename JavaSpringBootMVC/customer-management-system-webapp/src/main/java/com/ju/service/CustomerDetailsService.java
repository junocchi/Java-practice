package com.ju.service;

import java.util.List;

import com.ju.dto.entity.CustomerDetail;

public interface CustomerDetailsService {
	List<CustomerDetail> getDetailsByCustomerId(int customerId);
}
