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
import org.springframework.web.bind.annotation.RestController;

import com.guess.dto.entity.Round;
import com.guess.dto.entity.RoundList;
import com.guess.model.service.RoundService;

@RestController
public class RoundResource {

	@Autowired
	private RoundService roundService;

	// GET rounds/{gameid}
	@CrossOrigin
	@GetMapping(path = "/rounds/{gameid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoundList> getAllRoundsByGameId(@PathVariable("gameid") int gameid) {
		RoundList roundList = new RoundList(roundService.getAllRoundsByGameId(gameid));
		if (roundList.getRounds().size() > 0)
			return new ResponseEntity<RoundList>(roundList, HttpStatus.OK);
		else
			return new ResponseEntity<RoundList>(roundList, HttpStatus.NO_CONTENT);
	}

	@CrossOrigin
	@GetMapping(path = "/round/{roundid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Round> getSingleRoundByRoundId(@PathVariable("roundid") int roundid) {
		Round round = roundService.getSingleRoundByRoundId(roundid);
		ResponseEntity response = null;
		if (round != null)
			response = new ResponseEntity<Round>(round, HttpStatus.FOUND);
		else
			response = new ResponseEntity<Round>(round, HttpStatus.NOT_FOUND);
		return response;
	}

	@CrossOrigin
	@PostMapping(path = "/newround", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Round> createRound(@RequestBody Round round) {
		Round createdRound = roundService.createRound(round);

		if (createdRound != null) {
			return new ResponseEntity<>(createdRound, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
