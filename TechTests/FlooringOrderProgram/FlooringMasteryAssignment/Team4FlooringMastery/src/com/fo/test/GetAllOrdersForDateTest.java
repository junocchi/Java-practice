package com.fo.test;

import com.fo.dataaccess.FoOrderDataAccessImpl;
import com.fo.dto.*;
import com.fo.utility.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.stream.Stream;
import com.fo.service.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetAllOrdersForDateTest {

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
	void test() throws NoOrdersFoundException, IOException {

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");

		LocalDate date = LocalDate.of(2013, 01, 06);
		String formattedDate = date.format(dateTimeFormatter);
		System.out.println(formattedDate);
		FoOrderDataAccessImpl dao = new FoOrderDataAccessImpl();
		FoBusinessLogicImpl fobusinessLogicImpl = new FoBusinessLogicImpl();
		LinkedList<Order> result = fobusinessLogicImpl.getAllOrdersForDate(formattedDate);
		assertTrue(result.size() > 0);
	}

	static Stream<String> DateProvider() {
		return Stream.of("Orders_06012013");
	}
}
