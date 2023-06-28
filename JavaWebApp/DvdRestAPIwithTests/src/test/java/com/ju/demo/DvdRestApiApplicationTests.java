package com.ju.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.ju.model.persistence.DvdDao;

@SpringBootTest
@ActiveProfiles("test")

class DvdRestApiApplicationTests {

	@Autowired
	private DvdDao dvdDao;
	
	
	@Test
	void testDeleteOne() {
		assertEquals(1, dvdDao.deleteRecord(5));
	}
	
	@Test
	void testDeleteTwo() {
		assertEquals(0, dvdDao.deleteRecord(12));
	}

}
