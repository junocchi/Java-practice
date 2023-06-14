package com.fo.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.fo.dto.*;
import com.fo.service.FoBusinessLogicImpl;
import java.time.LocalDate;

class EditOrderTest {

	FoBusinessLogicImpl service;
	LinkedList<Order> orders;

	@BeforeEach
	void setUp() throws Exception {
		service = new FoBusinessLogicImpl();
		orders = service.getAllOrdersForDate(LocalDate.of(2013, 06, 01));
	}

	@AfterEach
	void tearDown() throws Exception {
		service = null;
	}

	@Test
	void editOrder01() {
		// creating an Order object that holds order 1
		Order oldOrder = (Order) orders.stream().filter((anOrder) -> anOrder.getOrderNumber() == 1);

		// changing the costumer name to "Jack Brown"
		Order newOrder = oldOrder;
		newOrder.setCustomerName("Jack Brown");

		// calling editOrder to replace the old entry with new entry
		LinkedList<Order> editedOrders = service.editOrder(1, newOrder);

		// check if they are the same
		assertEquals(false, editedOrders.equals(orders));

	}

	@Test
	void editOrder02() {
		// creating an Order object that holds order 1
		Order oldOrder = (Order) orders.stream().filter((anOrder) -> anOrder.getOrderNumber() == 1);

		// calling editOrder to replace the old entry with itself
		LinkedList<Order> editedOrders = service.editOrder(1, oldOrder);

		// check if they are the same
		assertEquals(true, editedOrders.equals(orders));
	}

}
