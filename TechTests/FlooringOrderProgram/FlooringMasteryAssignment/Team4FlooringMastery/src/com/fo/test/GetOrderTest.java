package com.fo.test;

import com.fo.dto.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.LinkedList;
import com.fo.service.*;
import com.fo.dataaccess.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetOrderTest {

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
	void GetOrder01() throws Exception {
		FoOrderDataAccessImpl dao = new FoOrderDataAccessImpl();
		FoBusinessLogicImpl foBusinessLogicImpl = new FoBusinessLogicImpl();

		try {
			LinkedList<Order> ordersList = dao.readObjects("Orders_06012013.txt");

			for (Order order : ordersList) {
				boolean result = (foBusinessLogicImpl.getOrder(LocalDate.parse("2013-06-01"),1) != null);
				assertTrue(result);
			}
		} catch (FileNotFoundException ex) {
			fail();
		}
	}

	@Test
	void GetOrder02() throws Exception {
		FoOrderDataAccessImpl dao = new FoOrderDataAccessImpl();
		FoBusinessLogicImpl foBusinessLogicImpl = new FoBusinessLogicImpl();

		try {
			LinkedList<Order> orders = dao.readObjects("Orders_06012013.txt");

			for (Order order : orders) {
				boolean result = (foBusinessLogicImpl.getOrder(LocalDate.parse("2013-06-01"),99) == null);
				assertTrue(result);
			}
		} catch (FileNotFoundException ex) {
			fail();
		}
	}
}
