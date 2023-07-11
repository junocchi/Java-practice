package com.ju.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ju.dto.entity.CustomerShareDetailsList;
import com.ju.service.CustomerShareDetailsService;

@RestController
public class CustomerShareDetailsResource {

	@Autowired
	private CustomerShareDetailsService customerShareDetailsService;
	
	@GetMapping(path = "/customers/{cId}",produces = MediaType.APPLICATION_JSON_VALUE)
	CustomerShareDetailsList getCustomerByCustomerIdResource(@PathVariable("cId") int customerId) {
		return new CustomerShareDetailsList(customerShareDetailsService.getCustomerShareDetailsByCustomerId(customerId));
	}
}

//Output of http://localhost:9004/customers/1
//{"customerShareDetails":[{"detailsId":101,"customerId":1,"shareId":1001,"shareType":"A","quantity":10.5}]}