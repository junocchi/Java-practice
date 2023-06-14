package com.fo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fo.dto.*;
import com.fo.dataaccess.*;
import com.fo.service.*;

class CheckProductTypeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws Exception {

		FoBusinessLogic service;

		FoProductDataAccessImpl dao = new FoProductDataAccessImpl();

		LinkedList<Product> productsList = dao.readObjects("Products.txt");

		for (Product product : productsList) {

			FoBusinessLogicImpl fobusinessLogicImpl = new FoBusinessLogicImpl();
			boolean result = fobusinessLogicImpl.checkProductType("tile");
			assertTrue(result);
		}

	}

}
