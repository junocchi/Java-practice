package com.fo.test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.fo.dataaccess.FoOrderDataAccessImpl;
import com.fo.dto.Order;

class OrderReadObjectTest {

//	Declare an object to use the ReadObject method
	FoOrderDataAccessImpl orderReadObject;

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

	@Test // ReadObjectTest05 - checks if the readObject() method successfully reads the
			// orders from the specified file
	void readObjectTest05() {
		orderReadObject = new FoOrderDataAccessImpl();
		String fileName = "Orders_06012013.txt";

		try {
			LinkedList<Order> orders = orderReadObject.readObjects(fileName);
			assertNotNull(orders);
		} catch (Exception ex) {
			fail();
		}
	}

	@Test // ReadObjectTest06 - checks if an exception is thrown when an invalid file name
			// is provided
	void readObjectTest06() throws FileNotFoundException {
		orderReadObject = new FoOrderDataAccessImpl();
		String fileName = "foo.txt";

		assertThrows(FileNotFoundException.class, () -> orderReadObject.readObjects(fileName));
	}
}
