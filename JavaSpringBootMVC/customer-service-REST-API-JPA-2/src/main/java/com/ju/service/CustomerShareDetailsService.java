package com.ju.service;

import java.util.List;

import com.ju.dto.entity.CustomerShareDetails;

public interface CustomerShareDetailsService {

	List<CustomerShareDetails> getCustomerShareDetailsByCustomerId(int customerId);
}
