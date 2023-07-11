package com.ju.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ju.dto.entity.CustomerDetail;
import com.ju.dto.entity.CustomerShareDetails;
import com.ju.dto.entity.CustomerShareDetailsList;
import com.ju.dto.entity.Share;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<CustomerDetail> getDetailsByCustomerId(int customerId) {

		List<CustomerDetail> customerDetailList = new ArrayList<CustomerDetail>();
		CustomerShareDetailsList customerShareDetailsList = restTemplate
				.getForObject("http://localhost:9004/customers" + customerId, CustomerShareDetailsList.class);
		for (CustomerShareDetails customerShareDetails : customerShareDetailsList.getCustomerShareDetails()) {

			Share share = restTemplate.getForObject("http://localhost:9002/shares/" + customerShareDetails.getShareId(),
					Share.class);

			CustomerDetail customerDetail = new CustomerDetail(customerId, share.getShareName(),
					customerShareDetails.getShareType(), customerShareDetails.getQuantity(), share.getMarketPrice(),
					customerShareDetails.getQuantity() * share.getMarketPrice());

			customerDetailList.add(customerDetail);
		}

		return customerDetailList;
	}

}
