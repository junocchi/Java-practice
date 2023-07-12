package com.ju.dto.entity;

import java.util.List;

public class CustomerShareDetailsList {

	public CustomerShareDetailsList() {
		super();
	}

	List<CustomerShareDetails> customerShareDetails;

	public CustomerShareDetailsList(List<CustomerShareDetails> customerShareDetails) {
		super();
		this.customerShareDetails = customerShareDetails;
	}

	public List<CustomerShareDetails> getCustomerShareDetails() {
		return customerShareDetails;
	}

	public void setCustomerShareDetails(List<CustomerShareDetails> customerShareDetails) {
		this.customerShareDetails = customerShareDetails;
	}

	@Override
	public String toString() {
		return "CustomerShareDetailsList [customerShareDetails=" + customerShareDetails + "]";
	}

}
