package com.vm.client;

import com.vm.businessLogic.VmBusinessLogicImpl;
import com.vm.dao.ItemDataAccessImpl;
import com.vm.ui.VmUserInterfaceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VendingMachineConfig {
	
	@Bean("dataAccess")
	public ItemDataAccessImpl itemDataAccessImpl() {
		return new ItemDataAccessImpl();
	}

	@Bean("businessLogic")
	public VmBusinessLogicImpl vmBusinessLogicImpl() {
		return new VmBusinessLogicImpl(itemDataAccessImpl());
	}
	
	@Bean("userInterface")
	public VmUserInterfaceImpl vmUserInterfaceImp() {
		return new VmUserInterfaceImpl(vmBusinessLogicImpl());
	}
}
