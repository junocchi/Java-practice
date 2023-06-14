package com.fo.test;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import com.fo.dto.Order;
import com.fo.dto.Product;
import com.fo.dto.Tax;
import com.fo.service.FoBusinessLogicImpl;

class CalculateOrderTest {

	@Test // CalculateOrder01
	void CalculateOrder() {
//		Carpet,217.00,2.25,2.10,488.25,455.70,56.64,1000.59
		BigDecimal taxRate = new BigDecimal("6.00");
		BigDecimal area = new BigDecimal("217.00");
		BigDecimal costPerSquareFoot = new BigDecimal("2.25");
		BigDecimal laborCostPerSquareFoot = new BigDecimal("2.10");

		Tax tax = new Tax(null, null, taxRate);
		Product product = new Product("", costPerSquareFoot, laborCostPerSquareFoot);

		FoBusinessLogicImpl fobusinessLogicImpl = new FoBusinessLogicImpl();
		Order order = fobusinessLogicImpl.calculateOrder(null, 0, "", tax, product, area);

		BigDecimal expectedResult = new BigDecimal("1000.59");
		assertTrue(expectedResult.equals(order.getTotal()));
	}
}
