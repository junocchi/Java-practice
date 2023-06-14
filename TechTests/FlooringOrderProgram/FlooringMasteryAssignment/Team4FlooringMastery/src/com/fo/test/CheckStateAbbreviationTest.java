package com.fo.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.fo.service.FoBusinessLogicImpl;
import com.fo.utility.EntryNotFoundException;

class CheckStateAbbreviationTest {

	private FoBusinessLogicImpl foBusinessLogic;

	@BeforeEach
	void setUp() throws Exception {
		// we created the object and now the variable is pointing to
		// that object on heap
		foBusinessLogic = new FoBusinessLogicImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		// reference variable: null
		foBusinessLogic = null;
	}

	@Test // CheckState01 - returns true
	void checkStateAbb1() {
		String stateCode = "ca";
		boolean result;
		try {
			result = foBusinessLogic.checkStateAbbreviation(stateCode);
			assertTrue(result);
		} catch (EntryNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test // CheckState02
	void checkStateAbb2() {
		String stateName = "Kansas";
		boolean result;
		try {
			result = foBusinessLogic.checkStateAbbreviation(stateName);
			assertFalse(result);
		} catch (EntryNotFoundException e) {
			e.printStackTrace();
		}
	}

}
