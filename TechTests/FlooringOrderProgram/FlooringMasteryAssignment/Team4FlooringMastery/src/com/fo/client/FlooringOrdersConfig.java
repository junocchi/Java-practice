package com.fo.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fo.dataaccess.FoOrderDataAccessImpl;
import com.fo.dataaccess.FoProductDataAccessImpl;
import com.fo.dataaccess.FoTaxDataAccessImpl;
import com.fo.presentation.FoUserInterfaceImpl;
import com.fo.service.FoBusinessLogicImpl;

@Configuration
public class FlooringOrdersConfig {

	@Bean("Order Data Access")
	public FoOrderDataAccessImpl foOrderDataAccessImpl() {
		return new FoOrderDataAccessImpl();
	}

	@Bean("Product Data Access")
	public FoProductDataAccessImpl foProductDataAccessImpl() {
		return new FoProductDataAccessImpl();
	}

	@Bean("Tax Data Access")
	public FoTaxDataAccessImpl foTaxDataAccessImpl() {
		return new FoTaxDataAccessImpl();
	}

	@Bean("Service")
	public FoBusinessLogicImpl foBusinessLogicImpl() {
		return new FoBusinessLogicImpl(foOrderDataAccessImpl(), foProductDataAccessImpl(), foTaxDataAccessImpl());
	}

	@Bean("User Interface")
	public FoUserInterfaceImpl foUserInterfaceImpl() {
		return new FoUserInterfaceImpl(foBusinessLogicImpl());
	}
}
