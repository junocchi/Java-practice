package com.guess.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guess.dto.entity.GameRound;
import com.guess.dto.entity.GameRoundList;
import com.guess.dto.entity.Guess;
import com.guess.dto.entity.Round;
import com.guess.model.service.GameRoundService;

@RestController
public class GameRoundResource {

	@Autowired
	private GameRoundService gameRoundService;

	@GetMapping(path = "gameRounds/{rid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public GameRoundList getGameRoundByRoundId(@PathVariable("rid") String roundId) {
		return new GameRoundList(gameRoundService.getGameRoundByRoundId(roundId));
	}

	// POST guess
	@CrossOrigin
	@PostMapping(path = "guess", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Round> makeGuess(@RequestBody Guess guess) {
		Round round = gameRoundService.makeGuess(guess.getGameId(), guess.getGuess());

		if (round != null) {
			return new ResponseEntity<>(round, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}