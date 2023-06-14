package com.fo.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.fo.service.*;
import com.fo.utility.*;

class CheckDateTest {

	@Test
	public void checkDate01() {

		FoBusinessLogicImpl businessLogic = new FoBusinessLogicImpl();
		String futureDateString = "2023-12-31";

		boolean result = false;
		try {
			result = businessLogic.checkDate(futureDateString);
		} catch (InvalidDateException e) {
			fail();
		}

		Assertions.assertTrue(result);
	}

	@Test
	public void checkDate02() {

		FoBusinessLogicImpl businessLogic = new FoBusinessLogicImpl();
		String invalidDateString = "100/45/2027";

		Assertions.assertThrows(InvalidDateException.class, () -> businessLogic.checkDate(invalidDateString));
	}

	@Test
	public void checkDate03() {

		FoBusinessLogicImpl businessLogic = new FoBusinessLogicImpl();
		String pastDateString = "2020-01-01";

		boolean result = false;
		try {
			result = businessLogic.checkDate(pastDateString);
		} catch (InvalidDateException e) {
			fail();
		}

		Assertions.assertFalse(result);
	}
}
