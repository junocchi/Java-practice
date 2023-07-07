package com.guess.controller.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guess.dto.entity.Game;
import com.guess.model.service.GameService;

@RestController
public class GameResource {

	@Autowired
	private GameService gameService;

	// POST begin
	@PostMapping(path = "/begin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> beginGame(@RequestBody Game game) {
		int gameId = gameService.createGame(game);
		return new ResponseEntity<>(gameId, HttpStatus.CREATED);
	}

	// GET game
	@GetMapping(path = "/game", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Game>> returnGamesList(@RequestBody Game game) {
		List<Game> games = gameService.getAllGames();
		return new ResponseEntity<>(games, HttpStatus.OK);
	}

	// GET game/{gameId}
	@GetMapping(path = "/game/{gameId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Game> getGameById(@PathVariable int gameId,
			@RequestParam(required = false, defaultValue = "false") Boolean showAnswer) {
		Game game = gameService.getGameById(gameId, showAnswer);
		if (game == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(game, HttpStatus.OK);
	}


	@PutMapping(path = "/updategame/{gameId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Game> updateGame(@PathVariable int gameId, @RequestBody Game updatedGame) {
		Game game = gameService.getGameById(gameId, true);

		if (game == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		game.setGameStatus(updatedGame.getGameStatus());

		game = gameService.updateGame(game);

		return new ResponseEntity<>(game, HttpStatus.OK);
	}

}
