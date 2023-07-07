package com.guess.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.guess.dto.entity.Game;
import com.guess.model.persistence.GameDao;
import com.guess.model.persistence.GameDaoImpl;

@DataJdbcTest
class GameDaoImplTests {

	private JdbcTemplate jdbcTemplate;
	private GameDao gameDao;

	@Test
	@DisplayName("Create New Game Test")
	public void createNewGameTest() {
		Game game = new Game();
		game.setGameId(105);
		gameDao.createGame(game);
		List<Game> newList = gameDao.getAllGames();
		assertNotNull(newList);
		assertEquals(15, newList.size());
	}

	@Test
	@DisplayName("Find A Game By ID: 105")
	public void findAGameById105Test() {
		Game game = gameDao.getGameById(105);
		assertNotNull(game);
		assertEquals(100, game.getGameId());
	}

	@Test
	@DisplayName("Get All Games Test")
	public void getAllGamesTest() {
		List<Game> newList = gameDao.getAllGames();
		assertNotNull(newList);
		assertEquals(7, newList.size());
	}

	@Test
	@DisplayName("Update Game Info")
	public void updateGameInfoTest() {
		int gameId = 110;
		String newStatus = "in process";
		int newAnswer = 0;

		Game game = new Game();
		game.setGameId(gameId);
		game.setGameStatus(newStatus);
		game.setGameAnswer(newAnswer);

		gameDao.updateGame(game);

		List<Game> newList = gameDao.getAllGames();
		assertNotNull(newList);

		int count = 0;
		for (Game g : newList) {
			if (g.getGameId() == gameId) {
				count++;
				assertEquals(newStatus, g.getGameStatus());
				assertEquals(newAnswer, g.getGameAnswer());
			}
		}

		assertTrue(count != 0);
	}

}
