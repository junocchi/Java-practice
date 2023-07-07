package com.guess.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.guess.dto.entity.Round;
import com.guess.model.persistence.RoundDaoImpl;

@SpringBootTest
@ActiveProfiles("test")
class RoundsApplicationTests {
	
	@Autowired
	private RoundDaoImpl roundDao;

	@Test
    @DisplayName("Get A List Of All Rounds")
    public void getListOfAllStudentsTest() {
        List<Round> newList = roundDao.getAllRounds(1);
        assertNotNull(newList);
        assertEquals(3, newList.size());
    }
 
   @Test
    @DisplayName("Find Single Round By Id")
    public void findStudentByIdTest() {
        Round round = roundDao.getSingleRound(1);
        assertNotNull(round);
        assertEquals("4321", round.getGuess());
        assertEquals("e:0:p:4", round.getResult());
    }

}
